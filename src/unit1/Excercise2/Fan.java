package unit1.Excercise2;

class Fan {

	public static int SLOW = 1, MEDIUM = 2, FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String colour = "blue";
	
	public Fan() {
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean trueOrFalse) {
		this.on = trueOrFalse;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String newColour) {
		colour = newColour;
	}
	
	public String toString() {
		return "Speed: " + speed + "\n" + "Colour: " + colour + "\n" + "Radius: " + radius + "\n" + ((on) ? "The fan is on." : "The fan is off.");
	}
	
}
