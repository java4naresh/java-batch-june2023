class StaticObjectControl2
{
	
	static String Studentname="Studentname";

	static {
	System.out.println("Studentname");
	}



	{
	System.out.println("static block executes when the class is loaded");
	}

	public StaticObjectControl2(String Studentname){
	System.out.println(this.Studentname);
	
	this.Studentname=Studentname;
	
	System.out.println(this.Studentname);
	
	}

	public static void main(String args[])
	{
	StaticObjectControl2 Noc =new StaticObjectControl2("Hari");
	StaticObjectControl2 noc2 =new StaticObjectControl2("latha");
	}
}