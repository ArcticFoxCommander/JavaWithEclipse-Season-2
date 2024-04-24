package unit3.Excercise5;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Dallas");
		list.add("Dallas");
		list.add("Dallas");
		list.add("Houston");
		list.add("Dallas");
		
		for (int i = 0; i < list.size(); i++) {
			list.remove("Dallas");
		}
		
		System.out.println(list);
	}

}
