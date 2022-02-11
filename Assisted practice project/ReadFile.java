package phase1;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		char[] array = new char[10];
		try {
			//creates of reader using FileReader
			FileReader input = new FileReader("input.txt");
			//reads values
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
