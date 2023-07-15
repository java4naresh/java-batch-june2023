import java.util.Arrays;
class TwoDArray{
	public static void main(String args[])
	{
	
	int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int[][] reversedMatrix = new int[3][3];
	for (int i = 0; i < matrix.length; i++) {
    	for (int j = 0; j < matrix[i].length; j++) {
        reversedMatrix[matrix.length - 1 - i][j] = matrix[i][j];
    	}
      }
	for (int i = 0; i < reversedMatrix.length; i++) {
    	for (int j = 0; j < reversedMatrix[i].length; j++) {
        System.out.print(reversedMatrix[i][j] + " ");
      }
    	System.out.println();
    }
}
}
