package unit2.Excercise2;

public class TestFixedCourse {
	public static void main(String[] args) {
        Course course1 = new Course("Java Programming");

        course1.addStudent("Alice");
        course1.addStudent("Bob");
        course1.addStudent("Charlie");

        System.out.println("Number of students in the course: " + course1.getNumberOfStudents());
        System.out.println("Students in the course:");
        for (String student : course1.getStudents()) {
            System.out.println(student);
        }

        course1.dropStudent("Bob");

        System.out.println("\nNumber of students in the course after dropping one student: " + course1.getNumberOfStudents());
        System.out.println("Students in the course after dropping one student:");
        for (String student : course1.getStudents()) {
            System.out.println(student);
        }

        course1.clear();

        System.out.println("\nNumber of students in the course after clearing: " + course1.getNumberOfStudents());
        System.out.println("Students in the course after clearing:");
        for (String student : course1.getStudents()) {
            System.out.println(student);
        }
    }
}

