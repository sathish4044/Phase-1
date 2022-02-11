package phase1;

public class StringArrayDemo {

	public static void main(String[] args) {
    String[] strArray = {"R","S","T"};
    boolean found = false;
    int index = 0;
    String s = "S";
    for(int i=0; i<strArray.length;i++) {
    	if(s.equals(strArray[i])) {
    		index = i;
    		found = true;
    		break;
    		
    	}
    }
    if(found) {
    	System.out.println(s + "Found at index" +index);
    }
    else {
    	System.out.println(s + "Not found in the array" );
    }
	}

}
