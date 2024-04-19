package unit3.Excercise4;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		System.out.println(circle1.equals(circle2));
	}

}

class Circle {
	double radius;
	
	public boolean equals(Circle circle) {
		return this.radius == circle.radius; //((Circle)circle).radius;
	}
}