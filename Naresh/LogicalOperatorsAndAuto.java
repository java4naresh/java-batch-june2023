class LogicalOperatorsAndAuto 
{
	public static void main(String[] args) 
	{
		int num =  10;
		// 10 > 9 && 12 < 9
		/*if(num++ > 9 && ++num < 15) {
		System.out.println("Naresh");
		}
		System.out.println(num);//12*/
		// 9 > 9 9 < 15
		if(--num > 9 || num-- < 15) {
		System.out.println("Naresh");
		}
		System.out.println(num);//8
		// I will give number print given number is even or odd
	}
}
