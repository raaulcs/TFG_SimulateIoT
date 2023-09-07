package EsperClient;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONObject;

public class Receiver implements MqttCallback{
	Publisher pub;
	GestorDeConexiones gestorconexiones;
	EsperComponent espercomponent;
	
	public Receiver(GestorDeConexiones gestorconexiones, Publisher pub, EsperComponent esp) {
		this.gestorconexiones = gestorconexiones;
		this.pub = pub;
//		this.listener = new MyListener();
//		Configuration config = new Configuration();
//		this.epService = EPServiceProviderManager.getDefaultProvider(config);
		this.espercomponent = esp;
		for( int i=0; i<this.gestorconexiones.getLclient().size(); i++) {
			this.gestorconexiones.getLclient().get(i).setCallback(this);
		}
//		EsperEPL esper = new EsperEPL(epService, listener);
//		esper.run();
	}

	public void connectionLost(Throwable cause) {
		// TODO Auto-generated method stub
		
	}

	public void messageArrived(String topic, MqttMessage message) throws Exception {
		String dataReceived = new String(message.getPayload());
		System.out.println("ESPER " + this.gestorconexiones.getIDcliente()+ " | Received data: " + dataReceived + " |From topic: " + topic );
		
		JSONObject jsonmessage = new JSONObject(dataReceived);
		String value = jsonmessage.getString("value");

		//System.out.println(value.toString());
		messageToEsper(value, topic);

		
	}
	
	public void messageToEsper(String message, String topic) {
		Event event = null;
		if(topic.equals("Brightness")){
			event = new EventBrightness(Integer.parseInt(message));
			espercomponent.getEpService().getEPRuntime().sendEvent(event);
		}

	}

	public void deliveryComplete(IMqttDeliveryToken token) {
		// TODO Auto-generated method stub
		
	}
}
