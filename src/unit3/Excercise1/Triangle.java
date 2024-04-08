package unit3.Excercise1;

public class Triangle extends GeometricObject{
	
	private double side1;
	private double side2;
	private double side3;
	
	Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s  = (side1 + side2 + side3 ) / 2;
		double area = Math.pow(s * (s -side1) * (s-side2) * (s - side3), 0.5);
		return area;
		
	}
	
	public double getPerimeter() {
		double p = side1 + side2 + side3;
		return p;
	}
	
	public String toString() {
		return "Triangle description: Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3;
		
	}
}
