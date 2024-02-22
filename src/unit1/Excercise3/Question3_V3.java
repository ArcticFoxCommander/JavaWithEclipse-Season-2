package unit1.Excercise3;

public class Question3_V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t= new T();
		swap(t);
		System.out.println("e1 = " + t.e1 + " e2 = " + t.e2);
	}

	public static void swap(T t) {
		int temp = t.e1;
		t.e1 = t.e2;
		t.e2 = temp;
	}
	
}

class T {
	int e1 = 1;
	int e2 = 2;
}

