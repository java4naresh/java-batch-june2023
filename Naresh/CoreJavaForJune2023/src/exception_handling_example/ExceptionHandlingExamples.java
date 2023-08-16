package exception_handling_example;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		
		try {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[5]);
		} catch(NullPointerException e) {
			System.out.println("Please check index");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please check index");
			//e.printStackTrace();
			//System.err.print(e);
		} catch(Throwable e) {
			
		} finally {
			System.out.println();
			System.out.println("Exception handling completed");
		}
		
		System.out.println("Naresh");
		System.out.println("Srilatha");
		System.out.println("Shyamala");

	}

}
