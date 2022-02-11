package phase1;

public class StringConversion1 {

	public static void main(String[] args) {
				System.out.println("Implicit type Casting");
				byte p = 12;
				System.out.println("byte value :"+p);
				short q = p;
				System.out.println("short value:"+q);
				int r=q;
				System.out.println("int value: "+r);
				long s=r;
				System.out.println("long value: "+s);
				float t = s;
				System.out.println("float value: "+t);
				double u=t;
				System.out.println("double value: "+u);
				System.out.println("Explicit type casting");
				String str = "123";
				int n = Integer.parseInt(str);
				System.out.println(n);
				

			}

		


	}


