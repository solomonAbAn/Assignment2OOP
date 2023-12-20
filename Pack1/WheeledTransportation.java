package Pack1;

import Pack7.MixedObjects;

public class WheeledTransportation extends MixedObjects{
	private int numberOfWheels;
	private double maximumSpeed;
	private long serialNumber;
	
	public WheeledTransportation() {
		numberOfWheels = 1;
		maximumSpeed = 15;
		serialNumber = 1560465;
	}
	public WheeledTransportation(int nw, double ms, long sn) {
		numberOfWheels = nw;
		maximumSpeed = ms;
		serialNumber = sn;
	}
	public WheeledTransportation(WheeledTransportation c, long nsn) {
		numberOfWheels = c.numberOfWheels;
		maximumSpeed = c.maximumSpeed;
		serialNumber = nsn;
	}
	
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public double getMaximumSpeed() {
		return maximumSpeed;
	}
	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "This Wheeled Transportation – serial #" + serialNumber + " - has " + numberOfWheels + " wheels, has a maximum speed of " + maximumSpeed + " km/hr."; 
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
		WheeledTransportation other = (WheeledTransportation) obj;
		return Double.doubleToLongBits(maximumSpeed) == Double.doubleToLongBits(other.maximumSpeed)
				&& numberOfWheels == other.numberOfWheels ;
	}
}
