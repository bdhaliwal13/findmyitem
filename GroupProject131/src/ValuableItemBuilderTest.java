import static org.junit.Assert.*;

import org.junit.Test;

public class ValuableItemBuilderTest {

	@Test
	public void testSetItemName() {
		ValuableItem testItem = new ValuableItem();
		testItem.setItemName("test watch");
		
		assertEquals("test watch", testItem.getItemName());
	}

	@Test
	public void testSetTag() {
		ValuableItem testItem = new ValuableItem();
		testItem.setTag(8);
		
		assertNotEquals(0, testItem.getTag());
		assertEquals(8, testItem.getTag());
	}

	@Test
	public void testSetGpsLocation() {
		ValuableItem testItem = new ValuableItem();
		testItem.setGpsLocation("Sac State");
		
		assertNotEquals("home", testItem.getGpsLocation());
		assertEquals("Sac State", testItem.getGpsLocation());
	}

}
