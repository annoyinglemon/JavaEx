
public class ClassOfStudents {

	public static void main(String[] args) {
		
		//This calls the constructor of the Person class first and then the the constructor of the Student class.
		//The 'parent' class 
		Student siLemond = new Student("Lemond", 2);

		siLemond.writeOutput();

		Student siLemondPa = new Student("lemond", 3);
		
		siLemondPa.writeOutput();

		System.out.println("Are siLemond and siLemondPa the same student? " + siLemond.sameName(siLemondPa));
		System.out.println("Oh no! They can't be the same person! Let's change the name/ID of one!");
		
		siLemondPa.reset("siCalvin", 4);
		
		System.out.println("Are siLemond and siLemondPa the same student? " + siLemond.sameName(siLemondPa));
		System.out.println("Yay!");
		
		Firefighters ff = new Firefighters("Hello", 12, 3, 4);
		System.out.println(ff.toString());
		
	}
}
