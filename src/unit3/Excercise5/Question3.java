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
		
//		for (int i = 0; i < list.size(); i++) {
//			list.remove("Dallas");
//		}
		
		while (list.contains("Dallas")) {
			list.remove("Dallas");
		}
		
		System.out.println(list);
		
		ArrayList<String> cityList = new ArrayList<>();
		
	    cityList.add("Miami");
	    cityList.add("Miami");
	    cityList.add("Seoul");
	    cityList.add("Miami");
	    
	    System.out.println("List size? " + cityList.size());
//	    for (int n = 0; n < cityList.size(); n++ ) {
//	  	      cityList.remove("Miami");
//	    }
	    
		while (cityList.contains("Miami")) {
			cityList.remove("Miami");
		}
	    
	    System.out.println(cityList);
	}

}
