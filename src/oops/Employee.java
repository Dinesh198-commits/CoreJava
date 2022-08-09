package oops;

public class Employee {
	public String Name;
	public int id;
	public String department;
	
	public Employee() {
		System.out.println("This is default construc");
		
	}
	
	public Employee(String P1,int P2,String P3) {
		Name = P1;
		id = P2;
		department = P3;
	}
	
	
	public void Display() {
		System.out.println(Name);
		System.out.println(id);
		System.out.println(department);
	}

}