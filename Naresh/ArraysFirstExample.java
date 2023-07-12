import java.util.Arrays;
class ArraysFirstExample 
{
	public static void main(String[] args) 
	{
		// first way of array creation
		int[] numbers = {2,4,6,8,10};//5
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[0]);//2
        System.out.println(numbers[2]);//6
		System.out.println(numbers[1]);//4
		//System.out.println(numbers[5]);//error
        numbers[0] = 5;
		numbers[2] = 9;
		//numbers[5] = 11;
		System.out.println(Arrays.toString(numbers));
		// second way of array creation
		int[] numbers2 = new int[6];
        System.out.println(Arrays.toString(numbers2));
		numbers2[0] = 1;
		numbers2[1] = 3;
		numbers2[2] = 5;
		numbers2[3] = 7;
		numbers2[4] = 9;
		numbers2[5] = 11;
        System.out.println(Arrays.toString(numbers2));
		/*System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		System.out.println(numbers2[4]);
		System.out.println(numbers2[5]);*/
		for(int index = 0; index < numbers2.length; index++) {
		System.out.println(numbers2[index]);//
		}

	}
}
