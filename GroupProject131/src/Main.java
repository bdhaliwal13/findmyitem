import java.util.Scanner;
import java.io.*;
import java.time.chrono.JapaneseChronology;

public class Main {

	public static void main(String[] args) throws Exception {
		Menu.menu();
		//seed data for demo:joe, 1000 j street, watch,1,home
		
		//demo:
		// if item reports their item is lost:
		//1. User presses option two which invokes a method in the server where the arguement passed in to that method is the tagid that the user enters
		//2. server then notifies the FinderCell class (passes in tagid to a findercell method)
		//3. findandbroadcast method searches through registered tags and tries to match the tag that was entered by the user
		//4. if found, the system will broadcast tag every x amount of seconds (demo purposes). If not, will give some friendly message to user.
		//5. location repeats 7 times, if you need it for longer, report lost item again
		
		//Design pattern: Creational - more specifically, Builder design pattern (ValuableItemBuilder). We didn't believe it was necessary for the scope of this project, however since it was a requirement..
		//ValuableItemBuilder is a new class that is responsible for creating a ValuableItem object for you
		//advantage is if we wanted to expand on this and provide some flexibility, You don't have to specify all the paramters in constructor that otherwise would be required when creating a new Valuable item.

	}

}