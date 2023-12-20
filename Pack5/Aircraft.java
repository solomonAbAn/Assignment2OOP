package Pack5;


import Pack7.MixedObjects;

public class Aircraft extends MixedObjects{
	
	private double price; 
	private double maximumElevation;
	private long serialNumber;
	
	public Aircraft() {
		price = 5000000;
		maximumElevation = 1000;
		serialNumber = 15610651;
	}
	
	public Aircraft(double pr, double me, long sn) {
		price = pr;
		maximumElevation = me;
		serialNumber = sn;
	}
	
	public Aircraft(Aircraft c, long nsn) {
		price = c.price;
		maximumElevation = c.maximumElevation;
		serialNumber = nsn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMaximumElevation() {
		return maximumElevation;
	}


	public void setMaximumElevation(double maximumElevation) {
		this.maximumElevation = maximumElevation;
	}

	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "This Aircraft – serial #" + serialNumber + " - costs " + price + "$, has a maximum elevation of " + maximumElevation + " meters."; 
				//+ "It has 6 vehicles and its starting and destination stations are Montreal and Toronto”]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aircraft other = (Aircraft) obj;
		return Double.doubleToLongBits(maximumElevation) == Double.doubleToLongBits(other.maximumElevation)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
				
	}

	
	

	
	
	
	
	
	
}







