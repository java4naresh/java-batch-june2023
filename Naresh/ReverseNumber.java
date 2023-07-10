class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int rev = 0;
		// task reverse given number
		for(num = 101; num != 0; num = num/10) {
			int rem = num % 10; // 8, 7, 2
			rev = rev * 10 + rem;// 8, 87, 872
		    System.out.println(rem);
		}
        System.out.println("reverse number is "+ rev);
	}
}
