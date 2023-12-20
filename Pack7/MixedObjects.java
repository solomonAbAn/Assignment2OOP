package Pack7;



import Pack1.WheeledTransportation;
import Pack2.Train;
import Pack2.Tram;
import Pack3.Metro;
import Pack4.Monowheel;
import Pack5.Aircraft;
import Pack5.WorldWarIIAirplane;
import Pack6.Ferry;


public class MixedObjects {
    public  static MixedObjects[] generateMixedArrayWithOneFromEachClass() {
    	MixedObjects[] mixedArray1 = new MixedObjects[20];

        mixedArray1[0] = new WheeledTransportation();
        mixedArray1[1] = new Train();
        mixedArray1[2] = new Tram();
        mixedArray1[3] = new Metro();
        mixedArray1[4] = new Monowheel();
        mixedArray1[5] = new Aircraft();
        mixedArray1[6] = new WorldWarIIAirplane();
        mixedArray1[7] = new Ferry();
        mixedArray1[8] = new Aircraft();
        for(int i=0; i<9;i++) {
        	System.out.println(mixedArray1[i]);
        	System.out.println();
        }
    
        
    

        MixedObjects[] mixedArray2 = new MixedObjects[20];
        mixedArray2[0] = new WheeledTransportation();
        mixedArray2[1] = new Train();
        mixedArray2[2] = new Tram();
        mixedArray2[3] = new Metro();
        mixedArray2[4] = new Monowheel();
        mixedArray2[6] = new WorldWarIIAirplane();
        mixedArray2[7] = new Ferry();
		return mixedArray1;
		
        
    }
    public double getPrice() {
        // Implement this method in each subclass
        return 0.0;
    }

    

    
    public static void findLeastAndMostExpensiveAircraft(MixedObjects[] array) {
        // Initialize variables to keep track of least and most expensive Aircraft
        Aircraft leastExpensive = null;
        Aircraft mostExpensive = null;

        for (MixedObjects obj : array) {
            // Check if the object is an instance of Aircraft
            if (obj instanceof Aircraft) {
                Aircraft aircraft = (Aircraft) obj;

                // Check if the leastExpensive is null or the current aircraft is cheaper
                if (leastExpensive == null || aircraft.getPrice() < leastExpensive.getPrice()) {
                    leastExpensive = aircraft;
                }

                // Check if the mostExpensive is null or the current aircraft is more expensive
                if (mostExpensive == null || aircraft.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = aircraft;
                }
            }
        }

        // Display the information
        if (leastExpensive != null) {
            System.out.println("Least Expensive Aircraft:");
            System.out.println(leastExpensive);
        } else {
            System.out.println("No Aircraft found in the array.");
        }

        if (mostExpensive != null) {
            System.out.println("Most Expensive Aircraft:");
            System.out.println(mostExpensive);
        } else {
            System.out.println("No Aircraft found in the array.");
        }

        System.out.println("***************************************************************");
    }
}

