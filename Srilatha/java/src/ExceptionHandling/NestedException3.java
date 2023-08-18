package ExceptionHandling;

public class NestedException3 {

	public static void main(String[] args) {
		
				try {
					try {
						System.out.println(10/0);
						}catch(Exception e) {
						System.out.println("inside");
					}finally {
						System.out.println("inside finally");
					}
					String name="Srilatha";
					System.out.println(name.charAt(1));
				}catch(Exception e){
					System.out.println("outside");
				}finally {
					System.out.println("outside finally");
				}
				}
}

		
	


