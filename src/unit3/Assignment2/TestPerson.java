package unit3.Assignment2;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ** order is staff-faculty-employee-person-student ** //
		Staff staff = new Staff("Developer", new Name("Dominik", "Would", "You"), new Address("Hiberniastraße 10", "Bottrop", "Germany", "46240"), "2366-186-0", "dominik@wouldyoubot.com", "localhost", 22, new Date(6, 1, 2022));
		Faculty faculty = new Faculty("2:00PM-12:00AM", "Owner/Developer", new Name("Romeo", "Invite", "Tracker"), new Address("5 Av. Anatole France", "Champ de Mars - Paris", "France", "75007"), "02-42-64-03-39", "contact@invite-tracker.com", "Working from Home", 46.18, new Date(7, 10, 2020));
		Employee employee = new Employee(new Name("Real", "2", "Two"), new Address("12209 222 St", "Maple Ridge", "British Columbia", "V2X 5W7"), "604-222-2222", "twois2andtwoisrealfornotjusttwoday@twosday.two", "Programming Room 2", 22, new Date(2, 22, 2022));
		Person person = new Person(new Name("Matthias", "New Flyer", "D40LF"), new Address("3750 Kitchener St", "Burnaby", "British Columbia", "V5C 3L8"), "604-953-3333", "custrel@translink.ca");
		Student student = new Student(new Name("Marcus", "Fluffy", "Star"), new Address("Erikstrandvegen 13", "Tau", "Norway", "4120"), "953-42-649", "fluffystar_2004@outlook.com", "Student");
		System.out.println(staff.toString());
		System.out.println(faculty.toString());
		System.out.println(employee.toString());
		System.out.println(person.toString());
		System.out.println(student.toString());	
	}

}
