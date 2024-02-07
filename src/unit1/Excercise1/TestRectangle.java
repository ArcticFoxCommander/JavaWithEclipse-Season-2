package unit1.Excercise1;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle shape1 = new Rectangle(4, 40);
		Rectangle shape2 = new Rectangle(3.5, 35.9);
		
		
		System.out.println("The width, height, area, and perimeter is as follows for shape 1:");
		System.out.printf(" The width is %s.\n The height is %s.\n The area is %s.\n The perimeter is %s.\n", shape1.width, shape1.height, shape1.getArea(), shape1.getPerimeter());
		System.out.println("\nThe width, height, area, and perimeter is as follows for shape 2:");
		System.out.printf(" The width is %s. \n The height is %s. \n The area is %.2f \n The perimeter is %s.", shape2.width, shape2.height, shape2.getArea(), shape2.getPerimeter());
	}
	
	
	
}
