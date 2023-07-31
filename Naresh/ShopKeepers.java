class ShopKeepers 
{
	public static void main(String[] args) 
	{
		Calculator calculator = new Calculator();
		int sum = calculator.add(10,20);// calling
		System.out.println(sum);
		sum = calculator.add(2,5);
		System.out.println(sum);
		int sub = calculator.sub(20, 5);
        System.out.println(sub);
        int sumOfThreeNumbers = Calculator.addThreeNumbers(10, 20, 30);
		System.out.println(sumOfThreeNumbers);
		//calculator.addAndPrint(25,25);
	}
}