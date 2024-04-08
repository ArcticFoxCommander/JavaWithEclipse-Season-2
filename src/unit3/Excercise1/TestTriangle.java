package unit3.Excercise1;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the dimensions of side1: ");
		double s1 = input.nextDouble();
		System.out.print("Enter the dimensions of side2: ");
		double s2 = input.nextDouble();
		System.out.print("Enter the dimensions of side3: ");
		double s3 = input.nextDouble();
		System.out.print("Enter the color of the shape: ");
		String c = input.next();
		System.out.print("Input 'false' for 'no fill' and 'true' for 'fill': ");
		boolean f = input.nextBoolean();
		
		Triangle t = new Triangle(s1, s2, s3);
		System.out.println(t.toString());
		GeometricObject o = new GeometricObject(c, f);
		System.out.println(o.toString());
		input.close();
	}

}
