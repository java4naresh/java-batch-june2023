package ExceptionHandling;

public class NestedException2 {

	public static void main(String[] args) {
		
				try {
					try {
						System.out.println(10/0);
						
					}catch(Exception e) {
						System.out.println("inside");
					}finally {
						System.out.println("inside finally");
					}
					String name=null;
					System.out.println(name.charAt(0));
					
				}catch(Exception e){
					System.out.println("outside");
				}finally {
					System.out.println("outside finally");
				}
				}

		
	}


