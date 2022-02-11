package phase1;

public class ConstructorDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee("chota",1000);
		System.out.println(emp1.name);
		System.out.println(emp1.id);
		
		Employee emp2 = new Employee("bheem",2000);
		System.out.println(emp2.name);
		System.out.println(emp2.id);
		


	}

}
class Employee{
	String name;
	int id;
	//Default constructor

public Employee()
{
	name = "Default name";
	id = 1000;
	}
public Employee(String name,int id)
{
this.name = name;
this.id = id;
}}



