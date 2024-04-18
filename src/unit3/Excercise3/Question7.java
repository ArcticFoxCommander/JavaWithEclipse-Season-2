package unit3.Excercise3;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(3);
	}

}

class A extends B {
	public A(int t) {
		System.out.println("A");
	}
}

class B {
	public B() {
		System.out.println("B");
	}
}
