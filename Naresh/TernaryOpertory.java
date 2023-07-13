class TernaryOpertory 
{
	public static void main(String[] args) 
	{
		String result = "";
		int number = 6;
		int number2 = 5;
		/*if(number % 2 == 0) {
		 result = "Even";
		} else {
		 result = "Odd";
		}*/
		//result = (number % 2 == 0) ? "Even" : "Odd";
		// (condition) ? true statement : false statement;
		result = (number % 2 == 0) ? ((number2 % 2 == 0) ? "Both numbers are even" : "Both numbers are not even") : "Both numbers are not even";
		System.out.println(result);
	}
}
