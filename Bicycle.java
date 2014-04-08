class Bicycle {
public int cadence;
public int gear;
public int speed;
public int weight;

public void setUp(int gear1, int cadence1)
{
	this.gear = gear1;		//(this.) is equal to bmx or mb or whichever who calls this method
	this.cadence = cadence1;
}
public Bicycle()	//this is a constructor(up to 6 only)
{
 cadence = 1 ;	//or use this(0, 0, 0); can only be used on same constructor
 gear = 0;
 speed = 0;
 weight = 10 kg;
	
}

public void changeGear()
{
 gear = 15;
}
public void changeCadence()
{
 cadence = 2;
}
public void speedUp(int increment)
{
 this.speed = increment;
}
public void applyBrake()
{
 speed = speed - 10;
}
public void changeWeight(int w){
this.weight = w;
}
public void writeOutput()
{
System.out.println("Speed: " + speed);
System.out.println("Gear: " + gear);
System.out.println("Cadence: " + cadence);
}
public int getCadence()
{
 return cadence;
}
public Bicycle(int g, int s, int c) //constructor of bmx
{
	gear = g;
	speed = s;
	cadence = c;
}
public void speedUp() //enabled if different parameters even if same method name (Overloading Method)
{
	speed = speed + 5;
}
public Bicycle(int c)
{
	cadence = c;
}

}