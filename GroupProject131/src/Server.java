import java.util.Timer; // Using Timer Class
import java.util.TimerTask; // Using TimerTask Class

public class Server { // brinder

	int count; // int count for beamLocation()

	public void registerItem(ValuableItem someItem) {

		System.out.println("Registering: " + someItem);

	}

	public ValuableItem itemLost(ValuableItem someItem) {

		FinderCell finder = new FinderCell();

		finder.getGPSLoc(someItem);
		return someItem;

	}

	public ValuableItem beamLocation(ValuableItem lost) { // this will send location of lost item every 10 mins TO THE
															// USER

		/*
		 * FinderCell finder = new FinderCell();
		 * 
		 * finder.getGPSLoc(lost); System.out.println("");
		 */ // space needed

		Timer timer = new Timer();
		TimerTask myTask = new TimerTask() {
			@Override
			public void run() {

				// System.out.println(lost.getGpsLocation());
				System.out.println(
						"The item with tag: " + lost.getTag() + " was found at GPS Location: " + lost.getGpsLocation()); // Stole
																															// Sytem.out.println
																															// stuff
																															// from
																															// FinderCell

				count++;

				if (count > 2) { // Once repeated 3 times, task ends
					// myTask.cancel();
					System.out.println("Repeated for 3 times every 2 minutes, request location again.");

					timer.cancel(); // Cancels task
				}
			}
		};

		timer.schedule(myTask, 0, 2000); // Executes task every 2000 milliseconds, 2 seconds

		return lost;

	}
}