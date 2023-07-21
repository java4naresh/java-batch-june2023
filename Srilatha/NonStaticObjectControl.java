class NonStaticObjectControl
{
	String collegename= getcollegename();
	String collegename2= getcollegename2();

	public String getcollegename(){
	System.out.println("getcollegename()");
	return "Krishnaveni Degree College";
	}

	public String getcollegename2(){
	System.out.println("getcollegename2()");
	return "Victory Degree College";
	}

	{
	System.out.println("nonstatic block load while object Creation ...if we create multiple objects based on objects multiple nonstatic blocks created");
	}

	public NonStaticObjectControl(String collegename,String collegename2){
	System.out.println(this.collegename);
	System.out.println(this.collegename2);
	this.collegename=collegename;
	this.collegename2=collegename2;
	System.out.println(this.collegename);
	System.out.println(this.collegename2);
	}

	public static void main(String args[])
	{
	NonStaticObjectControl Noc =new NonStaticObjectControl("Balaji","vagdevi");
	NonStaticObjectControl noc2 =new NonStaticObjectControl("Mahitha","Sundar");
	}
}