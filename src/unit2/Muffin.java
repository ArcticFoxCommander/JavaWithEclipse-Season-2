package unit2;

public class Muffin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Muf");
		s.append("fin");
		s.reverse();
		s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		s.setCharAt(s.length() - 1, Character.toLowerCase(s.charAt(s.length() - 1)));
		System.out.println(s);
	}

}
