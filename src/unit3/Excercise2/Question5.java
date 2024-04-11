package unit3.Excercise2;

public class Question5 {
	private double radius;
	
	public Question5(double radius) {
		radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
//
//class B extends Question5 {
//	private double length;
//	
//	B(double radius, double length) {
//		Question5(radius);
//		length = length;
//	}
//	
//	@Override
//	
//	public double getArea() {
//		return getArea() * length;
//	}
//}
