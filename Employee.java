package Employee_Database;

public class Employee {
	
	int id;
	String name;
	char gender;
	double sal;
	
	Employee(int id)
	{
		this.id = id;
		System.out.println("Employee Constructor-1 has been called");
	}
	
	Employee(int id, String name)
	{
		this(id);
		this.name = name;
		System.out.println("Employee Constructor-2 has been called");
		
	}
	
	Employee(int id, String name, char gender)
	{
		this(id, name);
		this.gender = gender;
		System.out.println("Employee Constructor-3 has been called");
	}
	
	Employee(int id, String name, char gender, double sal)
	{
		this(id, name, gender);
		this.sal = sal;
		System.out.println("Employee Constructor-4 has been called");
	}
	
	

}
