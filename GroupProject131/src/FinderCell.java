import java.io.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FinderCell {

	public void findAndBroadcastTag(ValuableItem someItem, int userTag) { // this will send location of lost item every
																			// 10 mins TO THE

		if (userTag == someItem.getTag()) {
			Timer timer = new Timer();
			TimerTask myTask = new TimerTask() {
				int count = 0;

				@Override
				public void run() {
					count++;
					final String[] locations = {"Vacaville", "Chicago", "Marine World", "Chucky Cheese", "Ukraine", "Mumbai","Jupiter","Hong Kong", "Your Mother's House", "Cameroon", "Karachi", "Kuala Lumpur"};
					Random random = new Random();
					int index = random.nextInt(locations.length);
					for (int i = 0; i < index; i++) {
						someItem.setGpsLocation(locations[index]);
					}
					System.out.println("Owner: " + someItem.getOwnerName() + " with address: " + someItem.getAddress()
							+ " is notified that Owner's item: " + someItem.getItemName() + " with TagID: "
							+ someItem.getTag() + " was found at: " + someItem.getGpsLocation());
					if (count > 6) { // Once repeated 3 times, task ends
						// myTask.cancel();
						System.out.println("Location was repeated for 7 times, request location again.");
						timer.cancel(); // Cancels task
						Menu.menu();

					}

				}

			};
			timer.schedule(myTask, 0, 3000); // Executes task every 3000 milliseconds, 3 seconds (10 min in prod)

		} else {
			System.out.println("No registered item with tag:" + userTag + " was found :(. Please try again.");
			Menu.menu();

		}
	}

}