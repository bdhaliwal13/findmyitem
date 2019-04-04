
public class ValuableItem {	//class for valuable item
	private int tag;
	private String ownerDetails;
	private String gpsLocation;
	
	public ValuableItem(int tag, String ownerDetails, String gpsLocation) {
		super();
		this.tag = tag;
		this.ownerDetails = ownerDetails;
		this.gpsLocation = gpsLocation;
	}

	@Override
	public String toString() {
		return "ValuableItem [tag=" + tag + ", ownerDetails=" + ownerDetails + ", gpsLocation=" + gpsLocation + "]";
	}
	
}
