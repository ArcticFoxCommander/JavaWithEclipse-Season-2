package unit1.Excercise3;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2};
		swap(a[0], a[1]);
		System.out.println("a[0] = " + a[0] + " [a1] = " + a[1]);
	}

	public static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
}
