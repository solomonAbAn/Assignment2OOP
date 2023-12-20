package Pack6;

import Pack7.MixedObjects;

public class Ferry extends MixedObjects{

	private double maximumSpeed; 
	private double maximumLoad;
	private long serialNumber;
	private int counter = 70000;
	
	//default
	public Ferry() {
		maximumSpeed = 50;
		maximumLoad = 5000;
		serialNumber = getNextSerialNumber();
	}
	
	public Ferry(double ms, double ml, long sn) {
		maximumSpeed = ms;
		maximumLoad = ml;
		serialNumber = sn;
	}
	
	public Ferry(Ferry c, long nsn) {
		maximumSpeed = c.maximumLoad;
		maximumLoad = c.maximumLoad;
		serialNumber = nsn;
	}

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public double getMaximumLoad() {
		return maximumLoad;
	}

	public void setMaximumLoad(double maximumLoad) {
		this.maximumLoad = maximumLoad;
	}

	public long getSerialNumber() {
		return serialNumber;
	}
	public long getNextSerialNumber() {
        
        return ++counter;
    }
	@Override
	public String toString() {
		return "This Ferry – serial #" + serialNumber + " - has " + maximumLoad + "kg of maximum load, has a maximum speed of " + maximumSpeed + " km/hr."; 
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
		Ferry other = (Ferry) obj;
		return counter == other.counter
				&& Double.doubleToLongBits(maximumLoad) == Double.doubleToLongBits(other.maximumLoad)
				&& Double.doubleToLongBits(maximumSpeed) == Double.doubleToLongBits(other.maximumSpeed);
				
	}
}
