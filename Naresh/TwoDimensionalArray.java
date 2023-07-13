class TwoDimensionalArray
{
	public static void main(String[] args) 
	{
		// multi dimensional array
		int numbers[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][0]);
		numbers[0][0] = 10;
		System.out.println(numbers[0][0]);
	}
}
