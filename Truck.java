public class Truck extends Vehicle{
	private double lc;
	private int tc;

	public Truck(){
	super();
	lc = 0;
	tc = 0;
	}
	/*public Truck(String manufName1, double cylinder1, String owner1, double lc1, int tc1){
	super(manufName1, cylinder1, owner1);
	lc = lc1;
	tc = tc1;
	}*/
	public void resetVehicle(String newManuf, double newCyl, String newOwner, double newLc, int newTc){
	setVehicle(newManuf, newCyl, newOwner);
	lc = newLc;
	tc = newTc;
	}
	public double getLc(){
	return lc;
	}
	public int getTc(){
	return tc;
	}
	public void writeOutput(){
	super.writeOutput();
	System.out.println("Load Capacity: "+lc);
	System.out.println("Towing Capacity: "+tc);
	}
	public boolean sameTruck(Truck otherTruck){
	return (this.sameVehicle(otherTruck) && (this.lc == otherTruck.lc) && (this.tc == otherTruck.tc));
	}

}	