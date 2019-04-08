
public class Main {

	public static void main(String[] args) {
		ValuableItem fancyWatch = new ValuableItem(4444, "Brinder - 6000 J street - (916) 278-6011", null); // create
																											// item obj
		Server server = new Server(); // create server object

		server.registerItem(fancyWatch); // owner registers item

		LoctoServer id = new LoctoServer();
		
		id.sendGPSID(fancyWatch); //If owner sends request for location
	}

}
