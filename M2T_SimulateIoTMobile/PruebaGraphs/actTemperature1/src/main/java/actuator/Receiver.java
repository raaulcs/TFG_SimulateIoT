package actuator;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Receiver implements MqttCallback{
	GestorDeConexiones gestorconexiones;
	
	public Receiver(GestorDeConexiones gestorconexiones) {
		this.gestorconexiones = gestorconexiones;
		for( int i=0; i<this.gestorconexiones.getLclient().size(); i++) {
			this.gestorconexiones.getLclient().get(i).setCallback(this);
		}
	}

	public void connectionLost(Throwable cause) {
		// TODO Auto-generated method stub
		
	}

	public void messageArrived(String topic, MqttMessage message) throws Exception {
		String dataReceived = new String(message.getPayload());
		System.out.println("ACTUATOR" + this.gestorconexiones.getIDcliente() + " | Receive data: " + dataReceived + " | Doing following action in consequence: actuando!");
	}

	public void deliveryComplete(IMqttDeliveryToken token) {
		// TODO Auto-generated method stub
		
	}
	
}
