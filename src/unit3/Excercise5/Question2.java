package unit3.Excercise5;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Denver");
		list.add("Austin");
		list.add("Hello");
		//list.add(new java.util.Date());
		@SuppressWarnings("unused")
		String city = list.get(0);
		list.set(3, "Dallas");
		System.out.println(list.get(2));
	}

}
