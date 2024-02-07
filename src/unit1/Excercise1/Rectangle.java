package unit1.Excercise1;

class Rectangle {
	
	double width;
	double height;
	
	Rectangle() {
		
	width = 1;
	height = 1;	
		
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
	return 2 * (width + height);
	}
}
	

