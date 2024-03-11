package unit2.Assignment2;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author1 = new Author("Y. Daniel Liang", "daniel.liang@gmail.com", 'm');
		Book book1 = new Book("Introduction to Java Programming", author1, 54.99, 99);
		
		Author author2 = new Author("Jamie Chan", "jamie.chan@gmail.com", 'm');
		Book book2 = new Book("Learn Java in on day", author2,  16.21, 0);
		System.out.printf("Author is: %s%nAuthor's name is: %s%nAuthor's email is: %s%n%n", author1.toString(), author1.getName(), author1.getEmail());
		System.out.printf("Author is: %s%nAuthor's name is: %s%nAuthor's email is: %s%n%n", author2.toString(), author2.getName(), author2.getEmail());
		System.out.printf("Book's name is: %s%nBook's author is: %s%nBook's price is: %s%nBook's quantity is: %s%n%n", book1.getName(), book1.getAuthor(), book1.getPrice(), book1.getQty());
		System.out.printf("Book's name is: %s%nBook's author is: %s%nBook's price is: %s%nBook's quantity is: %s%n%n", book2.getName(), book2.getAuthor(), book2.getPrice(), book2.getQty());
	}

}
