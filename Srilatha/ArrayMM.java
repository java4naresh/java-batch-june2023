import java.util.Arrays;
	class ArrayMM{
	public static void main(String args[])
	{
	int[] arr = {0,8,7,66,9,5};
        int max = arr[0];
	int min = arr[0];
	for (int i = 1; i < arr.length; i++) {
    	if (arr[i] > max) {
        max = arr[i];
       	}
    	if (arr[i] < min) {
        min = arr[i];
    	}
	}
	System.out.println("Maximum element: " + max);
	System.out.println("Minimum element: " + min);
 }
}