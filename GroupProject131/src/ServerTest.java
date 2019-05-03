import static org.junit.Assert.*;

import org.junit.Test;

public class ServerTest {

	@Test
	public void objectNotNull() {
		Server serv = new Server();
		ValuableItem someOtherItem = new ValuableItemBuilder().setItemName("watch").setTag(1).setOwnerName("joe")
				.setAddress("1000 j street").setGpsLocation("home").getValuableItem(); // create
		
			assertNotNull(someOtherItem);	//test to ensure item is not null

	}

}
