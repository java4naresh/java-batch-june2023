import java.util.Arrays;
class DescendingArray
{
	public static void main(String args[])
	{
	int[] numbers={1,3,6,8,5};
	System.out.println(Arrays.toString(numbers));
	for(int i=0; i<numbers.length;i++){
	for(int j=i+1; j<numbers.length;j++){
	if(numbers[i]<numbers[j]){
	int temp = numbers[i];
	numbers[i] = numbers[j];
	numbers[j] = temp;
	}
	}
	}
	System.out.println(Arrays.toString(numbers));

     }
   }