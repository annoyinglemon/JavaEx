
import java.util.*;	
class inputDemo{
	
	public static void main(String args[]){
	String brand, make;
	double engine;
	Scanner input = new Scanner(System.in);
	vehicle lem = new vehicle();
	lem.brandname();
	lem.make();
	lem.engine();
	System.out.println("Your current Vehicle Brand: "+lem.brand);
	System.out.println("Your current Vehicle Make: "+lem.make);
	System.out.println("Your current Vehicle Engine: "+lem.engine);
	System.out.println();
	System.out.print("Your new Vehicle Brand: ");
	lem.brand = input.nextLine();
	System.out.print("Your new Vehicle make: ");
	lem.make = input.nextLine();
	System.out.print("Your new Vehicle engine: ");
	lem.engine = input.nextDouble();
	System.out.println();
	System.out.println("Your new Vehicle brand: "+ lem.brand);
	System.out.println("Your new Vehicle make: "+ lem.make);
	System.out.println("Your new Vehicle engine: "+ lem.engine);
	}
	
	
	}