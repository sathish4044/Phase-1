package phase1;
import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		//create file object
		File file = new File("newFile.txt");
		try {
			//trying to create file based on object
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("The file is created");
			}
				else {
					System.out.println("The file already exists");
			}
		}
catch(Exception e) {
	e.getStackTrace();
}
	}

}
