package unit1.Assignment3;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     RegularPolygon polygon1 = new RegularPolygon();
	     RegularPolygon polygon2 = new RegularPolygon(6, 4);
	     RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

	     System.out.printf("The perimeter of polygon one is %.1f and the area is %s.\n", polygon1.getPerimeter(), polygon1.getArea());

	     System.out.printf("The perimeter of polygon two is %.1f and the area is %s.\n", polygon2.getPerimeter(), polygon2.getArea());
	     
	     System.out.printf("The perimeter of polygon three is %.1f and the area is %s.\n", polygon3.getPerimeter(), polygon3.getArea());
	}

}
