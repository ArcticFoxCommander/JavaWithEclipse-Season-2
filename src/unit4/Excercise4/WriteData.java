package unit4.Excercise4;

public class WriteData {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("scores1.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		// Create a file
		java.io.PrintWriter output = new java.io.PrintWriter(file);

		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.print("Emmanuel K Ilunga ");
		output.println(60);

		// Close the file
		output.close();
	}
}
