public class Student extends Person{	//this is a child/sub/derived class

	private int studentNumber;
	
	public Student(){
	super();
	studentNumber = 0;	//indicating no number yet
	}
	public Student(String initialName, int initialStudentNumber){
	super(initialName);
	studentNumber = initialStudentNumber;
	}
	public void reset(String newName, int newStudentNumber){
	setName(newName);
	studentNumber = newStudentNumber;
	}
	public int getStudentNumber(){
	return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber){
	studentNumber = newStudentNumber;
	}
	public void writeOutput(){
	super.writeOutput();
	System.out.println("Student Number: " + studentNumber);
	}
	public boolean equals(Student otherStudent){
	return(this.sameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber));

	}

}