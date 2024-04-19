package unit3.Excercise4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object fruit = new Fruit();
		Object apple = (Apple)fruit;
		System.out.println(fruit);
		System.out.println(apple);
	}

}

class Apple extends Fruit {
	
}

class Fruit {
	
}
