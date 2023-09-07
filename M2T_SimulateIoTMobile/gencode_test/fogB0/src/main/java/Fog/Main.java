package Fog;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
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
	
	public static void main(String [ ] args) throws UnknownHostException {	
		List<Topic> Ltopic = new ArrayList<Topic>();
		Topic topic;
		topic = new Topic("Fog", true, true);
		Ltopic.add(topic);
		topic = new Topic("B",  true  ,  true  );
		Ltopic.add(topic);

		List<Broker> Lbroker = new ArrayList<Broker>();
		Broker broker;
		//FIWARE COMMENT broker = new Broker("tcp://mosquitto-fogb0:1883", Ltopic);
		broker = new Broker("tcp://mosquitto-fogb0:1885", Ltopic);
		Lbroker.add(broker);

		Ltopic = new ArrayList<Topic>();

		GestorDeConexiones gestorconexiones = new GestorDeConexiones("fogB_0", Lbroker);
		gestorconexiones.Iniciar();
		Publisher publisher = new Publisher();
		//FIWARE COMMENT Receiver receiver = new Receiver(gestorconexiones, publisher, "tcp://mosquitto-fogb0:1883", false);
		Receiver receiver = new Receiver(gestorconexiones, publisher, "tcp://mosquitto-fogb0:1885", false);
	}
}
