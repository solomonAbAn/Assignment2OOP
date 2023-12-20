package Pack7;



import Pack1.WheeledTransportation;
import Pack2.Train;
import Pack2.Tram;
import Pack3.Metro;
import Pack4.Monowheel;
import Pack5.Aircraft;
import Pack5.WorldWarIIAirplane;
import Pack6.Ferry;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WheeledTransportation myWT = new WheeledTransportation();
		myWT.setSerialNumber(15610516);
		myWT.setNumberOfWheels(5);
		myWT.setMaximumSpeed(321);
		System.out.println("myWT: " + myWT);
		System.out.println();

		WheeledTransportation myWT2 = new WheeledTransportation();
		myWT2.setSerialNumber(25610516);
		myWT2.setNumberOfWheels(6);
		myWT2.setMaximumSpeed(154);
		System.out.println("myWT2: " + myWT2);
		System.out.println();

		WheeledTransportation myWT3 = new WheeledTransportation(myWT2, 15612385);
		System.out.println("myWT3: " + myWT3);
		System.out.println();

		Train myTrain = new Train();
		myTrain.setNumberOfWheels(30);
		myTrain.setDestinationStation("Dollard Des Ormeaux");
		myTrain.setMaximumSpeed(321);
		myTrain.setNumberOfVehicles(50);
		myTrain.setStaringStation("UQAM");
		System.out.println("myTrain: " + myTrain);
		System.out.println();

		Train myTrain2 = new Train();
		myTrain2.setNumberOfWheels(5);
		myTrain2.setDestinationStation("UQAM");
		myTrain2.setMaximumSpeed(154);
		myTrain2.setNumberOfVehicles(20);
		myTrain2.setStaringStation("Montreal Nord");
		System.out.println("myTrain2: " + myTrain2);
		System.out.println();

		Train myTrain3 = new Train(myTrain2, 45123);
		System.out.println("myTrain3: " + myTrain3);
		System.out.println();

		Metro myMetro = new Metro();
		myMetro.setNumberOfWheels(30);
		myMetro.setDestinationStation("Dollard Des Ormeaux");
		myMetro.setMaximumSpeed(300);
		myMetro.setNumberOfVehicles(50);
		myMetro.setStaringStation("UQAM");
		myMetro.setTotalNumberOfStops(13);
		System.out.println("myMetro: " + myMetro);
		System.out.println();

		Metro myMetro2 = new Metro();
		myMetro2.setNumberOfWheels(30);
		myMetro2.setDestinationStation("Dollard Des Ormeaux");
		myMetro2.setMaximumSpeed(300);
		myMetro2.setNumberOfVehicles(20);
		myMetro2.setStaringStation("UQAM");
		myMetro2.setTotalNumberOfStops(13);
		System.out.println("myMetro2: " + myMetro2);
		System.out.println();

		Metro myMetro3 = new Metro(myMetro2, 45123);
		System.out.println("myMetro3: " + myMetro3);
		System.out.println();

		Tram myTram = new Tram();
		myTram.setNumberOfWheels(30);
		myTram.setDestinationStation("Dollard Des Ormeaux");
		myTram.setMaximumSpeed(300);
		myTram.setNumberOfVehicles(50);
		myTram.setStaringStation("Montreal Nord");
		myTram.setTotalNumberOfStops(13);
		myTram.setYearOfCreation(1978);
		System.out.println("myTram: " + myTram);
		System.out.println();

		Tram myTram2 = new Tram();
		myTram2.setDestinationStation("Baie D'Urfe");
		myTram2.setMaximumSpeed(350);
		myTram2.setNumberOfVehicles(12);
		myTram2.setNumberOfWheels(13);
		myTram2.setStaringStation("Montreal Nord");
		myTram2.setTotalNumberOfStops(10);
		myTram2.setYearOfCreation(1950);
		System.out.println("myTram2: " + myTram2);
		System.out.println();

		Tram myTram3 = new Tram(myTram2, 45123);
		System.out.println("myTram3: " + myTram3);
		System.out.println();

		Monowheel myMW = new Monowheel();
		myMW.setNumberOfWheels(5);
		myMW.setMaximumSpeed(321);
		myMW.setMaximumWeight(300);
		System.out.println("myMW: " + myMW);
		System.out.println();

		Monowheel myMW2 = new Monowheel();
		myMW2.setNumberOfWheels(6);
		myMW2.setMaximumSpeed(154.21);
		myMW2.setMaximumWeight(250.32);
		System.out.println("myMW2: " + myMW2);
		System.out.println();

		Monowheel myMW3 = new Monowheel(myMW2, 45123);
		System.out.println("myMW3: " + myMW3);
		System.out.println();

		Aircraft myAC = new Aircraft();
		myAC.setMaximumElevation(1500.69);
		myAC.setPrice(6000000);
		myAC.setSerialNumber(45163211);
		System.out.println("myAC: " + myAC);
		System.out.println();

		Aircraft myAC2 = new Aircraft();
		myAC2.setMaximumElevation(1700.69);
		myAC2.setPrice(12050000);
		myAC2.setSerialNumber(49963211);
		System.out.println("myAC2: " + myAC2);
		System.out.println();

		Aircraft myAC3 = new Aircraft(myAC2, 45123);
		System.out.println("myAC3: " + myAC3);
		System.out.println();

		WorldWarIIAirplane myWWA = new WorldWarIIAirplane();
		myWWA.setMaximumElevation(1500.69);
		myWWA.setPrice(62999000);
		myWWA.setTwinEngine(true);
		System.out.println("myWWA: " + myWWA);
		System.out.println();

		WorldWarIIAirplane myWWA2 = new WorldWarIIAirplane();
		myWWA2.setMaximumElevation(2025.61);
		myWWA2.setPrice(6000000);
		myWWA2.setTwinEngine(true);
		System.out.println("myWWA2: " + myWWA2);
		System.out.println();

		WorldWarIIAirplane myWWA3 = new WorldWarIIAirplane(myWWA2, 45123);
		System.out.println("myWWA3: " + myWWA3);
		System.out.println();

		Ferry myFerry = new Ferry();
		myFerry.setMaximumLoad(10000.415);
		myFerry.setMaximumSpeed(30.21);
		System.out.println("myFerry: " + myFerry);
		System.out.println();

		Ferry myFerry2 = new Ferry();
		myFerry2.setMaximumLoad(30400.495);
		myFerry2.setMaximumSpeed(63.32);
		System.out.println("myFerry2: " + myFerry2);
		System.out.println();

		Ferry myFerry3 = new Ferry(myFerry2, 45123);
		System.out.println("myFerry3: " + myFerry3);
		System.out.println();
		
		
		
		//************************
		
		
        MixedObjects mixedObjects = new MixedObjects();

     
        MixedObjects[] mixedArray1 = mixedObjects.generateMixedArrayWithOneFromEachClass();
        MixedObjects[] mixedArray2 = mixedObjects.generateMixedArrayWithOneFromEachClass();
        mixedObjects.findLeastAndMostExpensiveAircraft(mixedArray1);
        mixedObjects.findLeastAndMostExpensiveAircraft(mixedArray2);
        
        
        
        System.out.println("Does myMW equals myMW2? " + myMW.equals(myMW2));
	}
}
