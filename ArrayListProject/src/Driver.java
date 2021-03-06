import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printStudents(ArrayList<Student> studList) {
		for (Student s : studList) {
			System.out.println("Name: " + s.getFirstName() + " " +
					s.getLastName() + "\nYear of Birth: " +
					s.getBirthYear());
		}
	}
	
	public static void removeStudent(String student, ArrayList<Student> studList) {
		for (int i=0; i<studList.size(); i++) {
			if (studList.get(i).getLastName().equalsIgnoreCase(student)) {
				studList.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
//		Student student1 = new Student("Jane", "Doe", 1980);
//		Student student2 = new Student("John", "Dew", 1987);
//		Student student3 = new Student("Sarah", "Green", 1985);
//		
//		studentList.add(student1);
//		studentList.add(student2);
//		studentList.add(student3);
//		
//		printStudents(studentList);
//		
//		System.out.println("Enter the name of student whom you want to remove:");
//		
//		String lastNameEntered = input.nextLine();
//		removeStudent(lastNameEntered, studentList);
//		
//		printStudents(studentList);
		
		System.out.println("Press q for quit, otherwise enter any key");
		String sEntered = input.next();
		
		while(!sEntered.equalsIgnoreCase("q")) {
			System.out.println("Enter the first name of student");
			String fname = input.next();
			System.out.println("Enter the last name of student");
			String lname = input.next();
			System.out.println("Enter the birth year of student");
			int bYear = input.nextInt();
			
			Student s = new Student(fname, lname, bYear);
			
			studentList.add(s);
			
			System.out.println("Press q for quit, otherwise enter any key");
			sEntered = input.next();
		} 	
		printStudents(studentList);
	}
}
