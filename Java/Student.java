
public class Student {
	String firstName;
	String lastName;
	int age;
	
	//Student object with no paramaeters
	public Student(){
		this.age = 0;
	}
	
	//Student object constructor with parameters
	public Student(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	
	//Method for returning Student String in the format of -> "firstName+lastName+age"
	public String getStudentString(){
		return getFirstName() + getLastName() + getAge();
	}

}
