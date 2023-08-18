package ExceptionHandling;

public class NestedException {

	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/0);
				
			}catch(Exception e) {
				System.out.println("inside");
			}finally {
				System.out.println("inside finally");
			}
			System.out.println("out try");
		}catch(Exception e){
			System.out.println("outside");
		}finally {
			System.out.println("outside finally");
		}
		}

}


