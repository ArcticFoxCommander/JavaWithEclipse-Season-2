package unit2.Excercise1;

public class MyInteger {

	private int value;
	
	MyInteger(int value) {
		
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd (int val) {
		if (val % 2 != 0) {
			return true;
		}
		return false;
	}
	
	
}
