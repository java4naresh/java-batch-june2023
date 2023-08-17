package ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[5]);
			}catch(Throwable e) {
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
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("please check index");
			e.printStackTrace();
			//System.out.println(e.toString());
			//System.err.print(e.getMessage());
		}finally {
			System.out.println();
			System.out.println("Exception handling completed");
		}
		
		System.out.println("Srilatha");
		System.out.println("Syamala");
		System.out.println("Srivalli");
		
	}

	}


