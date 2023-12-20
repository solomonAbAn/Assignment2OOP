package Pack2;

import java.util.Objects;

import Pack1.WheeledTransportation;

public class Train extends WheeledTransportation {
	private int numberOfVehicles ; 
	private String staringStation;
	private String destinationStation;  
	protected long serialNumber;
	private static int counter = 10000;
	
	
	//Default
	public Train() {
	    super();
	    numberOfVehicles = 4;
	    staringStation = "Montreal";
	    destinationStation = "Dollard Des Omeaux";
	    serialNumber = getNextSerialNumber(); 

	}
	public Train(int nv, String ss, String ds, long sn){
		super();
		numberOfVehicles = nv;
		staringStation = ss;
		destinationStation = ds;
		serialNumber = sn;

	}
	public Train(Train c, long nsn) {
		super(c, nsn);
		numberOfVehicles = c.numberOfVehicles;
		staringStation = c.destinationStation;
		destinationStation = c.destinationStation;
		serialNumber = nsn;
	}

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}


	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}


	public String getStaringStation() {
		return staringStation;
	}


	public void setStaringStation(String staringStation) {
		this.staringStation = staringStation;
	}


	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public long getSerialNumber() {
		return serialNumber;
	}
	
	public long getNextSerialNumber() {
	    
	    return ++counter;
	}
	@Override
	public String toString() {
		return "This Train – serial #" + serialNumber + " - has " + super.getNumberOfWheels() + " wheels, has a maximum speed of " + super.getMaximumSpeed() + " km/hr. \n" 
				+ "It has " + numberOfVehicles + " vehicles and its starting and destination stations are " + staringStation + " and " + destinationStation;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return counter == other.counter && Objects.equals(destinationStation, other.destinationStation)
				&& numberOfVehicles == other.numberOfVehicles 
				&& Objects.equals(staringStation, other.staringStation);
	}
	
	
	
}
