package ExceptionHandling;

public class ExceptionHandlingReturn {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	public static int m1() {
		try {
			System.out.println(10/0);
			return 10;
			}catch(Exception e) {
				return 5;
			}finally {
				return 15;
			}

	}

}
