package unit1.Excercise3;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count myCount = new Count();
		int times = 0;
		
		for (int i = 0; i < 100; i++)
			increment(myCount, times);
		
		System.out.println("Count is: " + myCount.count);
		System.out.println("Times is: " + times);
	}

	public static void increment(Count c, int times) {
		c.count++;
		times++;
	}
	
}
