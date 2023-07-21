class ObjectControlFlow3
{
	{
	System.out.println("object2 is created");
	}

	int number=30;
	int number2;

	{
	System.out.println("object is created");
	}

	public ObjectControlFlow3(int number,int number2){
	System.out.println(this.number);
	System.out.println(this.number2);
	this.number=number;
	this.number2=number2;
	System.out.println(this.number);
	System.out.println(this.number2);
	}


	public static void main(String args[])
	{
	
	ObjectControlFlow3 ocf3 = new ObjectControlFlow3(1,4);
	ObjectControlFlow3 ocf4 = new ObjectControlFlow3(16,15);
	}


	{
	System.out.println("This is object block3");
	}
}