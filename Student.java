package week5day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("Giritharan");
	}
	public void studentDept() {
		System.out.println("ECE");
		
	}
	public void studentId() {
		System.out.println("id: EC004");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
Department d=new Department();
d.collegeCode();d.collegeName();d.collegeRank();
s.deptName();s.studentName();
s.studentDept();s.studentId();

	}

}
