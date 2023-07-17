class ObjectControlFlow 
{

    {
	System.out.println("This is object block2");
	}

    int number = getNumber();

	int number2 = getNumber2();

	public int getNumber() {
	System.out.println("getNumber()");
	return 20;
	}

	public int getNumber2() {
	System.out.println("getNumber2()");
	return 0;
	}

	{
	System.out.println("Object is creating");
	}

    public ObjectControlFlow(int number, int number2) {
	System.out.println(this.number);
	System.out.println(this.number2);
	this.number = number;
	this.number2 = number2;
	System.out.println(this.number);
	System.out.println(this.number2);
	}


	public static void main(String[] args) 
	{
		ObjectControlFlow ocf = new ObjectControlFlow(10,40);
		ObjectControlFlow ocf2 = new ObjectControlFlow(5,15);
	}

	
}
