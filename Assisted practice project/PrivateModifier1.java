package phase1;

class PrivateAccessModifier{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public class main{
	public main(String[] main) {
		PrivateAccessModifier d = new PrivateAccessModifier();
		d.setName("park");
		System.out.println(d.getName());
	}
}}