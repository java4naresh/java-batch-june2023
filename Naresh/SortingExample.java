import java.util.Arrays;
class SortingExample 
{
	public static void main(String[] args) 
	{
		int[] numbers = {25,20,30,90,50};//sorting order {20,25,30,50,90}
		/*System.out.println(Arrays.toString(numbers));
        for(int i=0; i<numbers.length;i++) {
		for(int j=i+1; j<numbers.length;j++) {
		if(numbers[i] > numbers[j]) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		}
		}
		}
       System.out.println(Arrays.toString(numbers));*/
	   for(int number:numbers) {
       System.out.println(number);
       }

	}
}
