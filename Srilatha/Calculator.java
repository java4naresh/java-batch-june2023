class Calculator
{
	public int add(int num1,int num2){
	return num1+num2;
	}



        public int sub(int num1,int num2){
	return num1-num2;
	}



	public int mul(int num1,int num2){
	return num1*num2;
	}

	


	public int div(int num1,int num2){
	return num1/num2;
	}

	public static void main(String args[])
	{
	Calculator calc=new Calculator();
	Calculator calc2=new Calculator();
	Calculator calc3=new Calculator();
	Calculator calc4=new Calculator();
	{
	int result1=calc.add(2,5);
	System.out.println(result1);
	}

	{
	int result2=calc2.sub(3,5);
	System.out.println(result2);
	}
	

	{
	int result3=calc3.mul(10,5);
	System.out.println(result3);
	}

	{
	int result4=calc4.div(2,5);
	System.out.println(result4);
	}


	}
}

