package Fog;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONArray;
import org.json.JSONObject;

public class Receiver implements MqttCallback{
	private Publisher pub;
	private GestorDeConexiones gestorconexiones;
	private MongoGestor mongogestor;
	private String FogUrl;
	private boolean redirect;
	
	public Receiver(GestorDeConexiones gestorconexiones, Publisher pub, String FogUrl, MongoGestor mongogestor, boolean redirect) {
		this.gestorconexiones = gestorconexiones;
		this.pub = pub;
		for( int i=0; i<this.gestorconexiones.getLclient().size(); i++) {
			this.gestorconexiones.getLclient().get(i).setCallback(this);
		}
		this.mongogestor = mongogestor;
		this.FogUrl = FogUrl;
		this.redirect = redirect;
	}

	public Receiver(GestorDeConexiones gestorconexiones, Publisher pub, String FogUrl , boolean redirect) {
		this.gestorconexiones = gestorconexiones;
		this.pub = pub;
		for( int i=0; i<this.gestorconexiones.getLclient().size(); i++) {
			this.gestorconexiones.getLclient().get(i).setCallback(this);
		}
		this.FogUrl = FogUrl;
		this.redirect = redirect;
	}

	public void connectionLost(Throwable cause) {
		// TODO Auto-generated method stub
		
	}
	
	public String getFogUrl() {		
		return this.FogUrl;
	}
	
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		String dataReceived = new String(message.getPayload());
		
		if (topic.contentEquals("Fog")) {
			try {
			System.out.println("FOG " + this.gestorconexiones.getIDcliente() +" | Processing data to redirect: " + dataReceived);
			if(!this.redirect)
				RedirectToFog(dataReceived);
			mongogestor.appenJsonDocument(dataReceived, topic);
			}catch (Exception e) {
				System.out.println("Error en protocolo de redirecciÃ³n");
			}
			
		}else {
			System.out.println("FOG " + this.gestorconexiones.getIDcliente()+ " | Received data: " + dataReceived + " |From topic: " + topic );
			if(this.mongogestor != null) {
				mongogestor.appenJsonDocument(dataReceived, topic);
			}
		}
//		if(dataReceived.equals("hola"))
//			pub.Publish("recibido!", topic, gestorconexiones.getClientByTopicName(topic));
		//mongogestor.appendDocument(topic, dataReceived);
	}
	
	public void RedirectToFog(String message) {
		JSONObject jsonmessage = new JSONObject(message);
		JSONArray arr = jsonmessage.getJSONArray("route");
		boolean redirected = false;

		for (int i = 0; i<arr.length(); i++) {
			//System.out.println(this.FogUrl + " " + arr.getString(i));
			if(this.FogUrl.equals(arr.getString(i))) {
				for(int j=0; !redirected && j<gestorconexiones.getLbroker().size(); j++) {
					if(i+1 <  arr.length() && arr.get(i+1).equals(gestorconexiones.getLclient().get(j).getServerURI())) {
						//System.out.println("i "+arr.length());
						if(i+2 == arr.length()) {
							String topic = jsonmessage.getString("topic");
							System.out.println("FOG "  + this.gestorconexiones.getIDcliente() + " | Redirecting data on topic: " + topic + ", on destiny Fog: "+ arr.get(i+1));
							pub.Publish(message, topic, gestorconexiones.getLclient().get(j));
							redirected=true;
						}else {
							System.out.println("FOG "  + this.gestorconexiones.getIDcliente() + " | Redirecting to intermidiary Fog: "+gestorconexiones.getLclient().get(j).getServerURI());
							pub.Publish(message, "Fog", gestorconexiones.getLclient().get(j));
							redirected=true;
						}
					}
				}
			}
		}
		
		if(!redirected) {
			if(arr.length()>0){
				if(!this.FogUrl.equals(arr.get(arr.length()-1))){
					System.out.println("FOG "  + this.gestorconexiones.getIDcliente() + " | Nodo Fog siguiente en ruta no comunicado con nodo Fog actual, eliminando registro...");
				}
			}
		}
		
	}
	
	
	public void deliveryComplete(IMqttDeliveryToken token) {
		// TODO Auto-generated method stub
		
	}
}

