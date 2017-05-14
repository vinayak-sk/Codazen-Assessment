import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {

		//Creating instances of 3 differnet students
		Student A = new Student("George", "Washington", 23);
		Student B = new Student("John", "Adams", 25);
		Student C = new Student("Thomas", "Jefferson", 27);
		
		//Creating arrays of 4 different classes
		Student[] class1 = {A,B};
		Student[] class2 = {A,C};
		Student[] class3 = {A,B,C};
		Student[] class4 = {C};
		
		//Comparing matching count of students in 2 classes and storing it in result
		int result = compareClasses(class1,class4);
		
		//compareClasses function will return '-1' if there is even one student that has all three properties matching to that of another student
		if(result == -1){
			System.out.println("There are two students wiht all three same attributes");
		}
		//If all students are unique it will return count of matching Students
		else{
			System.out.println("Number of student common in class1 and class4 are: " + result);
		}
	}
	
	//Function to compare matching students in 2 classes
	public static int compareClasses(Student[] classA, Student[] classB){
		//Using a HashMap to store students on one class. 
		//Key = String containing Students firstName+lastName+age , as all 3 together are unique. Value = Student object
		HashMap<String, Student> hm = new HashMap<String, Student>();
		int count = 0;
		
		//Inserting students from first class into HashMap
		for(Student currentStudent: classA ){
			if(hm.containsKey(currentStudent.getStudentString())){
				//ThrowException
				return -1;
			}
			else{
				hm.put(currentStudent.getStudentString(), currentStudent);
			}
		}
		
		//Comparing students from second class to students present in HashMap form first class
		for(Student currentStudent: classB){
			if(hm.containsKey(currentStudent.getStudentString())){
				count += 1;
			}
		}
		return count;
	}
}