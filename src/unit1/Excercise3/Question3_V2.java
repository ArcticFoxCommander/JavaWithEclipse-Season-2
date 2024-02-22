package unit1.Excercise3;

public class Question3_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2};
		swap(a);
		System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
	}

	public static void swap(int[] a) {
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	
}
