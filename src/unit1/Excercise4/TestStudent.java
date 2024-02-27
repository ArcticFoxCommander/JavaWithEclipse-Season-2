package unit1.Excercise4;

import java.time.LocalDate;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student senior = new Student("Emmanuel", "Ilunga", "392840729", LocalDate.parse("1976-10-01"));
		
		System.out.printf("Student information\nFirst Name: %s\nLast Name: %s\nID Number: %s\nBirthday: %s\nAge: %s",senior.getFirstName(), senior.getLastName(), senior.getStudentNumber(), senior.getBirthDay(), senior.age()); 
	}

}
