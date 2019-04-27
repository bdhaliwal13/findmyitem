import java.util.Random;
import java.util.Timer; // Using Timer Class
import java.util.TimerTask; // Using TimerTask Class

public class Server {


	

	public ValuableItem itemLost(ValuableItem someItem, int someTag) {
		
		
		System.out.println("server is searching for your lost item...");
		System.out.println(" ");
		
		FinderCell finder = new FinderCell();
		finder.findAndBroadcastTag(someItem, someTag);
			return someItem;
	}

}