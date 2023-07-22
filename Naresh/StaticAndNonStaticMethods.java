class StaticAndNonStaticMethods 
{

    public int multiply(int num1, int num2) {
    //int num3 = getNum3(num1,num2);
	int num3 = getStaticNum3(num1,num2);
	int mul = num1 * num2 * num3;
	return mul;
	}

	public int getNum3(int num1, int num2) {
	 return num1+num2;
	}

	public static int getStaticNum3(int num1, int num2) {
	 return num1+num2;
	}

	public static int staticMultiply(int num1, int num2) {
	int num3 = getNum3(num1,num2);
	int mul = num1 * num2 * num3;
	return mul;
	}


	public static void main(String[] args) 
	{
		StaticAndNonStaticMethods sansm = new StaticAndNonStaticMethods();
        int mul = sansm.multiply(10,20);
		System.out.println(mul);
        /*int mul = StaticAndNonStaticMethods.staticMultiply(10,20);
		System.out.println(mul);*/
	}
}
