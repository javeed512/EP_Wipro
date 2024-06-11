package factorymethod.designpattern;

public class RoadCreatorImp implements Creator {

	@Override
	public Logistics getTransport() {  // method factory
		// TODO Auto-generated method stub
		return  new RoadLogistics();
	}

}
