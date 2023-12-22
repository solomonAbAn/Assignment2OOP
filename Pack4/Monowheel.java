package Pack4;


import Pack1.WheeledTransportation;
import Pack7.InvalidValueException;

public class Monowheel extends WheeledTransportation {
	private double maximumWeight;
	private long serialNumber;
	private static int counter = 55000;

	// Dfault
	public Monowheel() {
		super();
		maximumWeight = 150;
		serialNumber = getNextSerialNumber();
	}

	public Monowheel(double mw, long sn)  {
		super();
		
		maximumWeight = mw;
		serialNumber = sn;
	}
	public Monowheel(Monowheel c, long nsn) {
		super();
		maximumWeight = c.maximumWeight;
		serialNumber = nsn;
	}

	public double getMaximumWeight() {
		return maximumWeight;
	}

	public void setMaximumWeight(double maximumWeight) throws InvalidValueException {
		if (maximumWeight<0) {
			throw new InvalidValueException(" cannot be negative.");
		}
		this.maximumWeight = maximumWeight;
	}

	public long getSerialNumber() {
		return serialNumber;
	}
	public long getNextSerialNumber() {
      
        return ++counter;
    }
	@Override
	public String toString() {
		return "This Monowheel – serial #" + serialNumber + " - has " + super.getNumberOfWheels() + " wheels, has a maximum speed of " + super.getMaximumSpeed() + " km/hr." 
				+ "\n It has " + maximumWeight + "kg as a maximum weight that can support";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monowheel other = (Monowheel) obj;
		return counter == other.counter
				&& Double.doubleToLongBits(maximumWeight) == Double.doubleToLongBits(other.maximumWeight);
				
	}
}
