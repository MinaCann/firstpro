package statickeyword;

public class Student {
          
	   String name;
	   static String id;
	   int grade;
	   int registrationYear;
	   static int counter =1000;
	   
	   public void setId() {
		   
		   counter++;
		   id="" + registrationYear + grade +counter;
	   }

	public Student(String name, int grade, int registrationYear) {
		super();
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId();
	}
}
