package Gestores;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.eclipse.paho.client.mqttv3.MqttClient;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Main {


	public static String getIpOfHost(String hostname, int format){
		BufferedReader reader;
		String ip="";
		boolean encontrado=false;
		int port=0;
		try {
			reader = new BufferedReader(new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("/tabladirecciones"))));

	    String line;
	    
			for (int i = 0; !encontrado && ((line = reader.readLine()) != null); i++)
			{
			  if(line.toLowerCase().equals(hostname.toLowerCase())) {
				  ip=reader.readLine();
				  encontrado=true;
				  port = i/2;
			  }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if(format==1) {
	    	ip = "tcp://"+ip+":"+String.valueOf(1883+port);
	    }else {
	    	if(format==2) {
		    	ip = ip+":"+String.valueOf(27017+port);
		    }
	    }
	        
	    return ip;
	}


	public static List<String> LoadCsv(int messagesAmount, String csvName){
		BufferedReader reader;
		List<String> ldata = new ArrayList<>();

		try {
			reader = new BufferedReader(new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("/" + csvName + ".csv"))));

			String line;
	    
			for (int i = 0; ((line = reader.readLine()) != null) && i<messagesAmount; i++)
			{
			  ldata.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	    return ldata;
	}


	public static String getRoute(String hostnames){
		String route = "[ ";
		
		hostnames = hostnames.replaceAll("\\s+","");
		String[] lhostnames = hostnames.split(",");
		
		for(int i=0; i < lhostnames.length; i++) {
			if(i!=lhostnames.length-1)
				route = route + "\"" + getIpOfHost(lhostnames[i], 1) +"\", ";
			else
				route = route + "\"" + getIpOfHost(lhostnames[i], 1) +"\" ]";
		}
		
		return route;
	}
	
	
	public static void main(String [ ] args) throws UnknownHostException {
		List<Topic> Ltopic = new ArrayList<Topic>();
		Topic topic;
		topic = new Topic("Presence",   false ,  true  );
		Ltopic.add(topic);
		
		List<Broker> Lbroker = new ArrayList<Broker>();
		Broker broker;
		//FIWARE COMMENT broker = new Broker("tcp://mosquitto-presence0:1883", Ltopic);
		broker = new Broker("tcp://mosquitto-presence0:1884", Ltopic);

		Lbroker.add(broker);
	
		int randId = ThreadLocalRandom.current().nextInt(0, 9999999);
		GestorDeConexiones gestorconexiones = new GestorDeConexiones("sensPresence_0_"+randId, Lbroker);
		gestorconexiones.Iniciar();
		Publisher publisher = new Publisher();
		Receiver receiver = new Receiver(gestorconexiones, publisher);

///////Para la publicacion de datos

		List<MqttClient> Lclient = gestorconexiones.getLclient();
		//String event;
		int randomNum;
		for (int i=0; i<100; i++) {
			//event = "{\"event\":{\"value\":"+ randomNum +"}}";  
			randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
			//FIWARE COMMENT publisher.Publish("{ \"value\" : " + randomNum + "" +" }", gestorconexiones.getIDcliente(), "/1234/sensPresence_0/attrs", Lclient.get(0));	
			if(!publisher.Publish("{ \"value\" : \"" + Integer.toString(randomNum) + "\"" +" }", gestorconexiones.getIDcliente(), "Presence", gestorconexiones.getClientByTopicName("Presence"))){
				gestorconexiones.reconnectClient(gestorconexiones.getClientByTopicName("Presence"));
			}	
			try {
				TimeUnit.MILLISECONDS.sleep((int)(1000/(1.0*1.0)));
			} catch (InterruptedException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
