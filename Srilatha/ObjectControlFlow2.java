class ObjectControlFlow2
{
	int number=30;
	int number2;

	public ObjectControlFlow2(int number,int number2){
	System.out.println(this.number);
	System.out.println(this.number2);
	this.number=number;
	this.number2=number2;
	System.out.println(this.number);
	System.out.println(this.number2);
}


	public static void main(String args[])
	{
	ObjectControlFlow2 ocf2 = new ObjectControlFlow2(10,40);
	}
}