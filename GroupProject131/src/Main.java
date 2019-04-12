public class Main {	//brinder

	public static void main(String[] args) {
		ValuableItem fancyWatch = new ValuableItem(4444, "Brinder - 6000 J street - (916) 278-6011", null); // create
																											// item obj
		Server server = new Server(); // create server object

		server.registerItem(fancyWatch); // owner registers item

		LocToServer id = new LocToServer();
		
		id.sendGPSID(fancyWatch); //If owner sends request for location
		
	
		server.itemLost(fancyWatch);
	}
	
	//should be a menu where you can either register, report your specific item lost. probably use cases...? goodluck 


}