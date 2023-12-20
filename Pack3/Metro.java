package Pack3;


import Pack2.Train;

public class Metro extends Train {
	private int totalNumberOfStops;
	private long serialNumb;
	private static int counter = 25000;
	
	
	
	public Metro() {
		//and including, the starting and destination stations
		super();
		totalNumberOfStops = 2;
		serialNumb = getNextSerialNumber();
	}
	public Metro(int ns, long sn) {
		//and including, the starting and destination stations
		super();
		totalNumberOfStops = ns + 2;
		serialNumb = sn;
	}
	public Metro(Metro c, long nsn) {
		//and including, the starting and destination stations
		super(c, nsn);
		totalNumberOfStops = c.totalNumberOfStops + 2;
		serialNumb = nsn;
		
		
	}
	public int getTotalNumberOfStops() {
		return totalNumberOfStops;
	}
	public void setTotalNumberOfStops(int totalNumberOfStops) {
		this.totalNumberOfStops = totalNumberOfStops;
	}
	public long getSerialNumb() {
		return serialNumb;
	}
	public long getNextSerialNumber() {
        
        return ++counter;
    }
	
	@Override
	public String toString() {
		return "This Metro – serial #" + serialNumb + " - has " + super.getNumberOfWheels() + " wheels, has a maximum speed of " + super.getMaximumSpeed() + " km/hr. \n" 
				+ "It has " + super.getNumberOfVehicles() + " vehicles and its starting and destination stations are " + super.getStaringStation() + " and " + super.getDestinationStation() + 
				"\n It also has " + totalNumberOfStops + " stops.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metro other = (Metro) obj;
		return counter == other.counter 
				&& totalNumberOfStops == other.totalNumberOfStops;
	}
}

