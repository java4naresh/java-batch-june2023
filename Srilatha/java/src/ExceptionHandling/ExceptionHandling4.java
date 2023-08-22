package ExceptionHandling;

public class ExceptionHandling4 {

	public static void main(String args[]) {
		
     String[]array = {"sri","sham","ram","siri"};
	
	try {
		for(int i=0;i<=array.length;i++) {
			System.out.println(array[i]);
		}
		
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.err.print("An error occured"+ae.getMessage());
		
	}finally {
		
				System.out.println("Finally block executed");
			}
		}
	
	
	
}

