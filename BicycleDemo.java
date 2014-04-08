class BicycleDemo {
public static void main (String args[]) {


Bicycle mb = new Bicycle();	//constructor method(create objects with initial values or initialize)
Bicycle bmx = new Bicycle(2, 0, 2);	//see bicycle.java file

mb.speed = 40;
mb.gear = 2;
mb.cadence = 1;

bmx.setUp(1, 1);
bmx.speedUp(100000);
bmx.changeGear();
bmx.changeCadence();

System.out.println("MB Status: ");
mb.writeOutput();

System.out.println("BMX Status: ");
bmx.writeOutput();

int c = bmx.getCadence();
System.out.println("Cadence of bmx is: "+c);
}
}