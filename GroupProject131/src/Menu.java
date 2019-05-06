import java.io.IOException;
import java.util.Scanner;

public class Menu {
	public static void menu() throws Exception {
		
		Server server = new Server();
		Scanner userIn = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Please Select an option:");
		System.out.println("[1] Register Device");
		System.out.println("[2] Report Lost Item");
		System.out.println("[3] Exit");
		int i = userIn.nextInt();
		//DESIGN PATTERN STUFF
		ValuableItem myItem = new ValuableItemBuilder().setItemName("watch").setTag(1).setOwnerName("joe").setAddress("1000 j street").setGpsLocation("home").getValuableItem(); // create
		if (i == 1) {
	
			userIn.nextLine(); // advance buffer

			System.out.println("Please enter your full name: ");
			if (userIn.hasNextLine()) {
				String ownerName = userIn.nextLine();
				myItem.setOwnerName(ownerName);
			}
			System.out.println("Please enter your address: ");
			if (userIn.hasNextLine()) {
				String address = userIn.nextLine();
				myItem.setAddress(address);
			}
			System.out.println("Please enter a name for the device: ");
			if (userIn.hasNextLine()) {;
				String itemName = userIn.nextLine();
				myItem.setItemName(itemName);
			}
			System.out.println("Please enter item Tag ID: ");
			if (userIn.hasNextInt()) {
				int id = userIn.nextInt();
				myItem.setTag(id);
			}
			
			System.out.println("Please enter current GPS Location: ");
			if (userIn.hasNextInt()) {
				int id = userIn.nextInt();
				myItem.setTag(id);
			}
			System.out.println("Registered Item: " + myItem.toString());
			menu();
			
		}
		if (i == 2) {	
			ValuableItem lost = new ValuableItem("watch",1,"joe","1000 j street","home");
			System.out.println("Please enter lost item Tag ID: ");
			if (userIn.hasNextInt()) {
				int enteredTag = userIn.nextInt();
				server.itemLost(lost,enteredTag);// method to find on server and then call finder cell

			}
		}
		if (i == 3) {
			System.out.println("Exiting...");
			return;
		}
		return;
	}
}
