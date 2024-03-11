package unit2.Assignment2;

public class Book {
	private String name;
	private double price;
	private int qty;
	private Author authorIt;
	
	public Book(String name, Author author, double price, int i) {
		this.name = name;
		this.price = price;
		this.qty = i;
		this.authorIt = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return authorIt;
	}
    public String getAuthorItName() {
        return authorIt.getName();
    }

    public String getAuthorItEmail() {
        return authorIt.getEmail();
    }

    public char getAuthorItGender() {
        return authorIt.getGender();
    }
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", author=" + authorIt + "]";
	}
	
	
	
}
