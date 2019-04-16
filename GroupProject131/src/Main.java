import java.util.Scanner;
import java.io.*;


public class Main {	//brinder

	public static void main(String[] args) {
		
		ValuableItem fancyWatch = new ValuableItem(4444, "Brinder - 6000 J street - (916) 278-6011", null); // create
																											// item obj
		Server server = new Server(); // create server object

		//server.registerItem(fancyWatch); // owner registers item

		LocToServer id = new LocToServer();
		
		id.sendGPSID(fancyWatch); //If owner sends request for location
		
	
		server.itemLost(fancyWatch);
		menu();
		System.out.println("done");
	}
	
	//should be a menu where you can either register, report your specific item lost. probably use cases...? goodluck 
	public static void menu() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please Select an option:");
		System.out.println("[1] Register Device");
		System.out.println("[2] Report Lost Item");
		System.out.println("[3] Exit");
		//while(userIn.hasNext()) {
			int i = userIn.nextInt();
			if(i == 1) {
				System.out.println("Please enter item Tag ID: ");
				if(userIn.hasNextInt()) { /*ValuableItem.setTag(userIn.nextInt());*/ System.out.println("getting id"); int id = userIn.nextInt();}
				//fancyWatch.setTag(userIn.nextInt());
			
				userIn.nextLine(); //advance buffer
				
				System.out.println("Please enter your full name: ");
				if(userIn.hasNextLine()) { /*ValuableItem.setTag(userIn.nextLine());*/ System.out.println("getting info"); String info = userIn.nextLine();}
				//fancyWatch.setOwnerDetails(userIn.nextLine());
				menu();
				
			}
			if(i == 2) {
				System.out.println("Please enter lost item Tag ID: ");
				if( userIn.hasNextInt() ) {
					//method to find on server and then call finder cell
					System.out.println("searching...");
					int lostId = userIn.nextInt();
					userIn.nextLine();
				
					//call finder cell
					menu();
				}
				
			}
			if(i == 3) {
				return;
			}
		//}
		return;
	}
	

}