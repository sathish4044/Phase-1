package phase1;

public class StringBufferDemo {

	public static void main(String[] args) {
		System.out.println("\n Methods of strings");
		//string length
		String s = new String("Hello World");
		System.out.println(s.length());
		//sub string
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		//string compare
		String s1 = "Ramu";
		String s2 = "Raamu";
		System.out.println(s1.compareTo(s2));
		//creating string buffer
		System.out.println("\n Creating string buffer");
		StringBuffer sbr = new StringBuffer("Welcome To Simplilearn!");
		sbr.append("Enjoy Your Learning");
		System.out.println(sbr);
		//creating string builder
		
		System.out.println("\n Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(0, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
        String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr1 = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr1); 

        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              	
          }

}
