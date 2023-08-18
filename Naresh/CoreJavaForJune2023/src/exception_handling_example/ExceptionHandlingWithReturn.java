package exception_handling_example;

public class ExceptionHandlingWithReturn {

	public static void main(String[] args) {
		System.out.println(m1());//15

	}
	
	public static int m1() {
		int num = 0;
		try {
			//System.out.println(10/0);
			num = 10;
		} catch(Exception e) {
			num = 5;
		} finally {
			num = 15;
		}
		System.out.println("Naresh");
		return num;
	}
	
	

}
