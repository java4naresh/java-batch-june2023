package ExceptionHandling;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[5]);
		}catch(Exception e) {
			System.out.println("please check index");
		}finally {
			System.out.println("Exception handling completed");
		}
		
		System.out.println("Srilatha");
		System.out.println("Syamala");
		System.out.println("Srivalli");
		
	
	try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[5]);
		
		}catch(NullPointerException e) {
			System.out.println("please check index");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please check index");
		}catch(Throwable e) {
			
		}finally {
			System.out.println("Exception handling completed");
		}
		
		System.out.println("Srilatha");
		System.out.println("Syamala");
		System.out.println("Srivalli");
		
	}
}
