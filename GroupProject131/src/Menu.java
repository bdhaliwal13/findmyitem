import java.util.Scanner;

public class Menu {
	public static void menu() {
		
		
		Server server = new Server();
		Scanner userIn = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Please Select an option:");
		System.out.println("[1] Register Device");
		System.out.println("[2] Report Lost Item");
		System.out.println("[3] Exit");
		// while(userIn.hasNext()) {
		int i = userIn.nextInt();
		ValuableItem myItem = new ValuableItem(); // create
		if (i == 1) {
	
			userIn.nextLine(); // advance buffer

			System.out.println("Please enter your full name: ");
			if (userIn.hasNextLine()) {
				// System.out.println("notating owner");
				String ownerName = userIn.nextLine();
				myItem.setOwnerName(ownerName);
			}
			System.out.println("Please enter your address: ");
			if (userIn.hasNextLine()) {
				// System.out.println("notating owner address: ");
				String address = userIn.nextLine();
				myItem.setAddress(address);
			}
			System.out.println("Please enter a name for the device: ");
			if (userIn.hasNextLine()) {
				// System.out.println("getting name");
				String itemName = userIn.nextLine();
				myItem.setItemName(itemName);
			}
			System.out.println("Please enter item Tag ID: ");
			if (userIn.hasNextInt()) {
				// System.out.println("getting id");
				int id = userIn.nextInt();
				myItem.setTag(id);
			}
			
			System.out.println("Please enter current GPS Location: ");
			if (userIn.hasNextInt()) {
				// System.out.println("getting id");
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
		// }
		return;
	}

}
