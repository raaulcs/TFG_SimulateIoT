package EsperClient;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import EsperClient.Publisher;

public class MyListener implements UpdateListener{
	Publisher publisher;
	RuleManager trules;
	
	public MyListener(RuleManager trules) {
		this.publisher = new Publisher();
		this.trules = trules;
	}
	
	
	public RuleManager getTrules() {
		return trules;
	}


	public void setTrules(RuleManager trules) { 
		this.trules = trules;
	}


	
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		EventBean event = newEvents[0];
//		System.out.println("Hiiiii");
		//System.out.println(gestorconexiones.getClientByTopicName(Topic));
		for (int i = 0; i < this.trules.getlOutputTopic().size(); i++) {
			publisher.Publish(trules.getMessage(), trules.getlOutputTopic().get(i), trules.getClient());
		}
		//System.out.println("Publishing Data");
		//System.out.println("illuminance=" + event.get("illuminance"));
	}
}
