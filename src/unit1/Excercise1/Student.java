package unit1.Excercise1;
import java.time.LocalDate;
import java.time.Period;

class Student {
	
	String firstName;
	String lastName;
	String studentNumber;
	LocalDate birthDay;
	String homeroom;
	
	public Student(String newFirstName, String newLastName, String newStudentNumber, LocalDate newBirthDay) {
		// TODO Auto-generated constructor stub
		firstName = newFirstName;
		lastName = newLastName;
		studentNumber = newStudentNumber;
		birthDay = newBirthDay;
	}
	


	public int age() {
		
		int age = Period.between(this.birthDay, LocalDate.now()).getYears();
		
		return age;
	}
	
	LocalDate getBirthDay() {
		return birthDay;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	String getStudentNumber() {
		return studentNumber;
	}
	
	String getHomeroom() {
		return homeroom;
	}
}
