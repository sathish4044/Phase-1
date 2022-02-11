package phase1;
class One{
	public void display() {
		System.out.println("One");
	}
}
//Inheritance
class Two extends One{
	public void display() {
		System.out.println("Two");
	}
	public int add(int x,int y) {
		return x+y;
	}
	//overload
	public Double add(double x,double y) {
		return x+y;
		
	}
}
//encapsulation
class EncapTest{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String newName) {
		name = newName;
		
	}
}

public class OopsDemo {

	public static void main(String[] args) {
		One a = new One();
		a.display();
		Two b = new Two();
		b.display();
		System.out.println(b.add(4, 2));
        System.out.println(b.add(5, 2));
        EncapTest encap = new EncapTest();
        encap.setName("Ramesh");
        System.out.println("name:" + encap.getName());
        
        
	}

}
