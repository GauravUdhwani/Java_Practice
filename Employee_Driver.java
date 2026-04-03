package Employee_Database;

public class Employee_Driver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101);
		System.out.println("Id of the Employee " +e1.id);
		System.out.println("Name of the Employee " +e1.name);
		System.out.println("Gender of the Employee " +e1.gender);
		System.out.println("Sal of the Employee " +e1.sal);
		System.out.println("-------------------");
		Employee e2 = new Employee(105, "Gaurav");
		System.out.println("Id of the Employee " +e2.id);
		System.out.println("Name of the Employee " +e2.name);
		System.out.println("Gender of the Employee " +e2.gender);
		System.out.println("Sal of the Employee " +e2.sal);
		// TODO Auto-generated method stub

	}

}
