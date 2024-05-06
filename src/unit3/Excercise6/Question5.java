package unit3.Excercise6;

import java.util.ArrayList;

import unit2.Loan;
import unit3.CircleFromSimpleGeometricObject;
import unit3.Assignment2.Date;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		Loan loan = new Loan();
		list.add(loan);
		Date date = new Date(0, 0, 0);
		list.add(date);
		String n = "Do the list";
		list.add(n);
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject();
		list.add(circle);
		int n1 = 0;
		while (n1 < list.size()) {
			Object n2 = list.get(n1);
			System.out.println(n2.toString());
			n1++;
		}

	}
	
}
