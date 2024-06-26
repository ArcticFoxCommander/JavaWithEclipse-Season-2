package unit3;

public class DynamicBindingDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object o = new GraduateStudent(); // implicit casting
		
		Object o1 = new Object();
		
		if (o1 instanceof GraduateStudent) {
		  System.out.println("Never got here");
		  GraduateStudent gs = (GraduateStudent)o1; // explicit casting
		}
		
	    m(o);
	    m(new Student());
	    m(new Person());
	    m(new Object());
	  }

	  public static void m(Object x) {
	    System.out.println(x.toString());
	  }
}
