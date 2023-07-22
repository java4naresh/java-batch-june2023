class StaticNonStatic
	{
	public static int add(int num1,int num2){
	int add=num1+num2;
	return add;
	}

	
	public int sub(int num1,int num2){
	int sub=num1-num2;
	return sub;
	}

	public static void main(String args[]){
	StaticNonStatic snc=new StaticNonStatic();
	int sub=snc.sub(10,6);
	System.out.println(sub);
	}

	{
	int result=StaticNonStatic.add(70,100);
	System.out.println(result);
	}
}