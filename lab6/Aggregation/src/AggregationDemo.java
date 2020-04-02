import java.util.List;
import java.util.ArrayList;

class Student{
	private String full_name;
	
	Student(String fullName) {
		this.full_name = fullName;
	}
	
	public String getFullName() {
		return this.full_name; 
	}
}


class Classroom{
	private String class_name;
	
	private List<Student> students;
	
	Classroom(String class_name) {
		this.class_name = class_name;
		
	}
	
	public String getClassName() {
		return this.class_name;
	}
	
	public List<Student> getStudentsinClass(){
		return this.students;
	}

}

public class AggregationDemo {

	public static void main(String[] args) {
		List<Student> acm_students = new ArrayList<Student>();
		
		Student person1 = new Student("Mehmet Ali");
		Student person2 = new Student("Duygu Deniz");
		Student person3 = new Student("Berat Asan");
		
		acm_students.add(person1);
		acm_students.add(person2);
		acm_students.add(person3);
		
		Classroom classACM1 = new Classroom("ACM321 OOP");
		
		
		
		List<Student> registered_student = classACM1.getStudentsinClass();
		
		for(int i=0; i < registered_student.size(); i++) {
			System.out.println(registered_student.get(i).getFullName());
		}
			
	}
}













