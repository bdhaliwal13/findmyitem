public class Server { // brinder

	public void registerItem(ValuableItem someItem) {

		System.out.println("Registering: " + someItem);

	}

	public ValuableItem itemLost(ValuableItem someItem) {

		FinderCell finder = new FinderCell();
		
		finder.getGPSLoc(someItem);
		return someItem;

	}
	
	public ValuableItem beamLocation(ValuableItem lost) {	//this will send location of lost item every 10 mins TO THE USER 
		return lost;
	}
	
	

}