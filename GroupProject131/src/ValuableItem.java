public class ValuableItem { // class for valuable item //brinder
	private String itemName;
	private int tag;
	private String ownerName;
	private String address;
	private String gpsLocation;

	public ValuableItem(String itemName, int tag, String ownerName, String address, String gpsLocation) {
		super();
		this.itemName = itemName;
		this.tag = tag;
		this.ownerName = ownerName;
		this.address = address;
		this.gpsLocation = gpsLocation;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	@Override
	public String toString() {
		return "ValuableItem [itemName=" + itemName + ", tag=" + tag + ", ownerName=" + ownerName + ", address="
				+ address + ", gpsLocation=" + gpsLocation + "]";
	}
	
	

}
