package Gestores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DeviceCore {
	List<Topic> Ltopic = new ArrayList<Topic>();
	List<Broker> Lbroker = new ArrayList<Broker>();
	GestorDeConexiones gestorconexiones;
	MobilityManager mobmanager;
	Publisher publisher;
	Receiver receiver;
	String name;
	TokenManager tokenManager = new TokenManager();
	IntermediateBuffering IBuffer;
	StadisticalLogInfo stadisticalloginfo;
	BatteryManager batterymanager;

	
	public DeviceCore(String name, List<Topic> Ltopic, List<Broker> Lbroker, int x, int y, int ibuffersize) {
		this.name=name;
		this.Ltopic=Ltopic;
		this.Lbroker=Lbroker;
		this.mobmanager = new MobilityManager(x, y, Lbroker);
		int randId = ThreadLocalRandom.current().nextInt(0, 9999999);
		gestorconexiones = new GestorDeConexiones(this.name+"_"+randId, Lbroker, false);
		//gestorconexiones.Iniciar();
		publisher = new Publisher();
		IBuffer = new IntermediateBuffering(ibuffersize);
		batterymanager = new BatteryManager(5000, publisher, gestorconexiones);
		stadisticalloginfo = new StadisticalLogInfo(publisher, IBuffer);
		receiver = new Receiver(this.gestorconexiones, this.tokenManager, this.publisher, this.Ltopic);
	}
	
	public void startMobilityToAnotherBroker() {
		String newBorkerURL=this.mobmanager.chooseNewBroker();
		if(newBorkerURL!="none") {
			System.out.println("------------ STARTING MOBILITY ------------");
			this.gestorconexiones.checkReachableBroker(name, newBorkerURL);
			this.receiver.updateCallback();
			///Token interaction
			this.tokenManager.requestTokenManagerNode(this.publisher, this.name, this.gestorconexiones.getIDcliente(), this.gestorconexiones.getLclient().get(0));
			///end Token interaction
			this.publisher.Publish("{ \"sensorname\" : \"" + this.name + "\"" +" }", this.gestorconexiones.getIDcliente(), "TDN", this.gestorconexiones.getLclient().get(0));
		}else {
			System.out.println("No Broker within range");
		}
	}
	
	public GestorDeConexiones getGestorDeConexiones() {
		return this.gestorconexiones;
	}
	
	public Publisher getPublisher() {
		return this.publisher;
	}
	public MobilityManager getMobilityManager() {
		return this.mobmanager;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Topic> getLTopic(){
		return this.Ltopic;
	}

	public IntermediateBuffering getIBuffer() {
		return IBuffer;
	}

	public void setIBuffer(IntermediateBuffering iBuffer) {
		IBuffer = iBuffer;
	}

	public StadisticalLogInfo getStadisticalloginfo() {
		return stadisticalloginfo;
	}

	public void setStadisticalloginfo(StadisticalLogInfo stadisticalloginfo) {
		this.stadisticalloginfo = stadisticalloginfo;
	}

	public BatteryManager getBatterymanager() {
		return batterymanager;
	}

	public void setBatterymanager(BatteryManager batterymanager) {
		this.batterymanager = batterymanager;
	}
}
