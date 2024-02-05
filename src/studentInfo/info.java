package studentInfo;

import java.time.LocalDate;

class info {
	public static void main(String[] args) {
		
		student junior = new student();
		
		junior.name = "Matthew Jones";
		junior.birthDay = LocalDate.parse("2010-09-01");
		
		System.out.printf("%s was born %s and they are now %d years old", junior.name, junior.birthDay.toString(), junior.age());
	}
}