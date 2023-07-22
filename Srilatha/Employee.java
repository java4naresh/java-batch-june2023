class Employee
	{
	String EmployeeName;
	int id;
	static int strength = 40;
	static String companyName="Tata";


	public Employee(String EmployeeName, int id){
	}


	public Employee(){
	}


	public static void main(String[] args)
	{
	Employee ep1 = new Employee();

	ep1.EmployeeName = "Sriram";
	ep1.id = 1;
	System.out.println(ep1.EmployeeName);
	System.out.println(ep1.id);
 	System.out.println(ep1.strength);
	System.out.println(ep1.companyName);

	Employee ep2 = new Employee();
	System.out.println(ep2.EmployeeName);
	System.out.println(ep2.id);
	System.out.println(ep2.strength);
	System.out.println(ep2.companyName);

	Employee ep3 = new Employee();
	System.out.println(ep3.EmployeeName);
	System.out.println(ep3.id);
	System.out.println(ep3.strength);
	System.out.println(ep3.companyName);

	ep1.companyName = "Infosys";
	System.out.println(ep1.strength);
	System.out.println(ep1.companyName);
	System.out.println(ep2.strength);
	System.out.println(ep2.companyName);
	System.out.println(ep3.strength);
	System.out.println(ep3.companyName);
	}
}