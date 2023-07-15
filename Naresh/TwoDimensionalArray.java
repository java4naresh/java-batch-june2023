import java.util.Arrays;
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
		//numbers[0][0] = 10;
		System.out.println(numbers[0][0]);
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10,11,12}};
	//int[][] reversedMatrix = new int[3][3];
	for (int i = 0; i < matrix.length; i++) {
    	for (int j = 0; j < matrix[i].length; j++) {
        //reversedMatrix[matrix.length - 1 - i][j] = matrix[i][j];
		if(i == matrix.length - 1) {
		int temp = matrix[0][j];
		matrix[0][j] = matrix[i][j];
		matrix[i][j] = temp;
		}
        
    	}
      }
	for (int i = 0; i < matrix.length; i++) {
    	for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
    	System.out.println();
	}
	}
}
