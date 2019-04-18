import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

public class FinderCell {			//tanner
	
	//File file = new FIle(whatever we read from here)
	
	//BufferedReader br = new BufferedRead(new FileReader(file));
	

	public int getGPSLoc(ValuableItem someItem) {
		
		System.out.print("The item with tag: " + someItem.getTag() + "was found at GPS Location: " + someItem.getGpsLocation());
		
		
		return 0;
	}
	
	public void findPhone(ValuableItem item) {
		int minutes = 10;
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("The phone with the tag" + item.getTag() + "was found at the location " + item.getGpsLocation());
			}
		}, 0, 1000*60*minutes);
	}	
		

	
	


}