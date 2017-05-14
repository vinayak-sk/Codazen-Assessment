import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		Student A = new Student("George", "Washington", 23);
		Student B = new Student("John", "Adams", 25);
		Student C = new Student("Thomas", "Jefferson", 27);
		
		Student[] class1 = {A,B};
		Student[] class2 = {A,C};
		Student[] class3 = {A,B,C};
		Student[] class4 = {C};
		
		int result = compareClasses(class1,class4);
		
		if(result == -1){
			System.out.println("There are two students wiht all three same attributes");
		}
		else{
			System.out.println("Number of student common in class1 and class4 are: " + result);
		}
	}
	
	public static int compareClasses(Student[] classA, Student[] classB){
		HashMap<String, Student> hm = new HashMap<String, Student>();
		int count = 0;
		
		for(Student currentStudent: classA ){
			if(hm.containsKey(currentStudent.getStudentString())){
				//ThrowException
				return -1;
			}
			else{
				hm.put(currentStudent.getStudentString(), currentStudent);
			}
		}
		
		for(Student currentStudent: classB){
			if(hm.containsKey(currentStudent.getStudentString())){
				count += 1;
			}
		}
		return count;
	}
}