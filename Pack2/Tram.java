package Pack2;

import java.util.Objects;

import Pack3.Metro;

public class Tram extends Metro {
	private int yearOfCreation;
	private long serialNumber;
	private static int counter = 30000;

	// default
	public Tram() {
		super();
		yearOfCreation = 1900;
		serialNumber = getNextSerialNumber();
	}

	// const
	public Tram(int yc, long sn) {
		super();
		yearOfCreation = yc;
		serialNumber = sn;
	}
	
	public Tram(Tram c, long nsn) {
		super(c, nsn);
		yearOfCreation = c.yearOfCreation;
		serialNumber = nsn;
	
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}

	public long getSerialNumber() {
		return serialNumber;
	}
	public long getNextSerialNumber() {
       
        return ++counter;
    }
	@Override
	public String toString() {
		return "This Tram – serial #" + serialNumber + " - has " + super.getTotalNumberOfStops() + 
				"\nstops, has been manufactured in " + yearOfCreation +
				", has " + super.getNumberOfWheels() + 
				"wheels, and has a maximum speed of " + super.getMaximumSpeed() + " km/hr. \n" 
						+ "It also has " + super.getNumberOfVehicles() + 
						" vehicles and its starting and destination stations are: \n" + super.getStaringStation() + " and " + super.getDestinationStation();
		
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tram other = (Tram) obj;
		return counter == other.counter  && yearOfCreation == other.yearOfCreation;
	}
}
