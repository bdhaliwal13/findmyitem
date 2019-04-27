
public class ValuableItemBuilder {
	private String itemName;
	private int tag;
	private String ownerName;
	private String address;
	private String gpsLocation;

	// no getters only setters!
	public ValuableItemBuilder setItemName(String itemName) {		//Valuableitem Return types!! 
		this.itemName = itemName;
		return this;
	}

	public ValuableItemBuilder setTag(int tag) {
		this.tag = tag;
		return this;
	}

	public ValuableItemBuilder setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		return this;
	}

	public ValuableItemBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public ValuableItemBuilder setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
		return this;
	}
	
	public ValuableItem getValuableItem() {
		return new ValuableItem(itemName, tag, ownerName,address,gpsLocation);	//will give us a new ValuableItem
	}
	

}
