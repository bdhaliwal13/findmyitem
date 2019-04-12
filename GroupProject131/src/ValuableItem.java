public class ValuableItem { // class for valuable item //brinder
	private int tag;
	private String ownerDetails;
	private String gpsLocation;

	public ValuableItem(int tag, String ownerDetails, String gpsLocation) {
		super();
		this.tag = tag;
		this.ownerDetails = ownerDetails;
		this.gpsLocation = gpsLocation;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getOwnerDetails() {
		return ownerDetails;
	}

	public void setOwnerDetails(String ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	public String getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	@Override
	public String toString() {
		return "ValuableItem [tag=" + tag + ", ownerDetails=" + ownerDetails + ", gpsLocation=" + gpsLocation + "]";
	}

}
