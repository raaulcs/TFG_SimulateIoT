package EsperClient;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.espertech.esper.client.EPServiceProvider;
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
		topic = new Topic("TopicB", true, false);
		Ltopic.add(topic);
		topic = new Topic("TopicC", false, true);
		Ltopic.add(topic);
		
		List<Broker> Lbroker = new ArrayList<Broker>();
		//FIWARE COMMENT Broker broker = new Broker("tcp://mosquitto-fogb1:1883", Ltopic);
		Broker broker = new Broker("tcp://mosquitto-fogb1:1885", Ltopic);

		Lbroker.add(broker);

		GestorDeConexiones gestorconexiones = new GestorDeConexiones("fogB_EsperComponent", Lbroker);
		gestorconexiones.Iniciar();
		Publisher publisher = new Publisher();

		List<RuleManager> lTopicRules = new ArrayList<RuleManager>();
		List<String> inputTopics  = new ArrayList<String>();
		List<String> outputTopics  = new ArrayList<String>();
		inputTopics  = new ArrayList<String>();
		outputTopics  = new ArrayList<String>();
		inputTopics.add("TopicB");
		outputTopics.add("TopicC");
		lTopicRules.add(new RuleManager("select value from EsperClient.EventTopicBFogB where value < 90", "rule meet", gestorconexiones.getLclient().get(0), inputTopics, outputTopics));
		
		EsperComponent esp = new EsperComponent(lTopicRules);
		Receiver receiver = new Receiver(gestorconexiones, publisher, esp);
	}
}	
