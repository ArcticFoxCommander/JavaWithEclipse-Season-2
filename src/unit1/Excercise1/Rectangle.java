package unit1.Excercise1;

class Rectangle {
	
	// Define as double with variables.
	
	double width;
	double height;

	// Constructor
	
	Rectangle() {
		
	width = 1;
	height = 1;	
		
	}
	
	// Constructor with the "new" width and height.
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	// Return area and perimeter.
	
	double getArea() {
		return width * height;
	}

	double getPerimeter() {
	return 2 * (width + height);
	}
}
	

