package phase1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
	String stringToSearch = "Happy Learning On Simplilearn";
	Pattern p = Pattern.compile("Learning");
	Matcher m = p.matcher(stringToSearch);
	if (m.find())
		System.out.println("Found a match");
	else
        System.out.println("Did not find a match");
	}

}
