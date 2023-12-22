package Pack5;

import Pack7.InvalidValueException;

public class WorldWarIIAirplane extends Aircraft {
	private boolean twinEngine;
	private long serialNumber;
	private static int counter = 80000;
	
	public WorldWarIIAirplane() {
		super();
		twinEngine = false;
		serialNumber = getNextSerialNumber();
	}
	public WorldWarIIAirplane(boolean te, long sn ) {
		super();
		twinEngine = te;
		serialNumber = sn;
	}
	
	public WorldWarIIAirplane(WorldWarIIAirplane c, long nsn)  {
		super(c, nsn);
		
		serialNumber = nsn;
		twinEngine = c.twinEngine;
	}
	
	public boolean isTwinEngine() {
		return twinEngine;
	}
	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public long getNextSerialNumber() {
        
        return ++counter;
    }
	
	@Override
	public String toString() {
		return "This World War II Airplane – serial #" + serialNumber + " - costs " + super.getPrice() + "$, has a maximum elevation of " + super.getMaximumElevation() + " meters." 
				+ "\n Does it have a twin engine? " + twinEngine;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorldWarIIAirplane other = (WorldWarIIAirplane) obj;
		return counter == other.counter  && twinEngine == other.twinEngine;
	}
	
}
