package unit1.Excercise4;

import java.time.LocalDate;
import java.time.Period;

class Student {
	
	private String firstName;
	private String lastName;
	private String studentNumber;
	private LocalDate birthDay;

	
	Student() {
		this("", "", "", LocalDate.parse("1970-01-01"));
	}
	
	public Student(String firstName, String lastName, String studentNumber, LocalDate birthDay) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.birthDay = birthDay;

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
	

}

