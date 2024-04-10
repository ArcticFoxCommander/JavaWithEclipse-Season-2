package unit3;

class Mark {

	int score;
	
	public Mark(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Mark [score=" + score + "]";
	}


}


public class TestMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mark mark = new Mark(3);
		System.out.println(mark.toString());
	}

}
