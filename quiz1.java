class vehicle{
	public String brand;
	public String make;
	public double engine = 0;

	
	public void brandname()
	{	brand = "honda"; }
	public void make()
	{	make = "civic";  }
	public void engine()
	{	engine = 5;	 }
	}
class print{
	public static void main(String args[]){
	vehicle lem = new vehicle();
	lem.brandname();
	lem.make();
	lem.engine();
	System.out.println("Brand Name: "+ lem.brand);
	System.out.println("Make: "+ lem.make);
	System.out.println("engine: "+ lem.engine);
	System.out.println();
	System.out.println("Brand: "+lem.brand+ " Make: " +lem.make+ " Engine: "+lem.engine);
	}

}

