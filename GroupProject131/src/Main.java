import java.util.Scanner;
import java.io.*;
import java.time.chrono.JapaneseChronology;

public class Main { // brinder

	public static void main(String[] args) {

		// Server server = new Server(); // create server object

		// server.registerItem(fancyWatch); // owner registers item

		// LocToServer id = new LocToServer();

		// id.sendGPSID(fancyWatch); //If owner sends request for location

		// server.itemLost(fancyWatch); messes up beamlocation() method
		menu();
		System.out.println("done");
		// server.beamLocation(fancyWatch); //just end casey's menu to make our code
		// work
		// i need more time to implement it into his menu - charlie
	}

	// should be a menu where you can either register, report your specific item
	// lost. probably use cases...? goodluck
	public static void menu() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please Select an option:");
		System.out.println("[1] Register Device");
		System.out.println("[2] Report Lost Item");
		System.out.println("[3] Exit");
		// while(userIn.hasNext()) {
		int i = userIn.nextInt();
		if (i == 1) {
			System.out.println("Please enter item Tag ID: ");
			if (userIn.hasNextInt()) {
				/* ValuableItem.setTag(userIn.nextInt()); */ System.out.println("getting id");
				int id = userIn.nextInt();
			}
			Server server = new Server();
			ValuableItem fancyWatch = new ValuableItem("watch", 4444, "Brinder", "1000 J Street", "Mars"); // create
			// item obj
			server.registerItem(fancyWatch);
			// fancyWatch.setTag(userIn.nextInt());

			userIn.nextLine(); // advance buffer

			System.out.println("Please enter your full name: ");
			if (userIn.hasNextLine()) {
				/* ValuableItem.setTag(userIn.nextLine()); */ System.out.println("getting info");
				String info = userIn.nextLine();
			}
			// fancyWatch.setOwnerDetails(userIn.nextLine());
			menu();

		}
		if (i == 2) {
			System.out.println("Please enter lost item Tag ID: ");
			if (userIn.hasNextInt()) {
				// method to find on server and then call finder cell
				System.out.println("searching...");
				int lostId = userIn.nextInt();
				userIn.nextLine();

				// call finder cell
				menu();
			}

		}
		if (i == 3) {
			return;
		}
		// }
		return;
	}

}