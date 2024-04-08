package unit3.Excercise1;

class A {
	public A() {
		System.out.println("A's no-arg contructor is invoked.");
	}
}

class B extends A {
	
}

class C {
	public C(int x) {
	}
}

class D extends C {
	public D(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public void C() {
		
	}
	
}

public class Question4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		D d = new D(0);
	}

}
