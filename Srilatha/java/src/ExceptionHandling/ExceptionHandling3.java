package ExceptionHandling;



public class ExceptionHandling3 {

	public static void main(String args[]) {
		
     String[]array = {"sri","sham","ram","siri"};
	
	try {
		for(String element:array) {
			System.out.println(element);
		}
		
	}catch(Exception e) {
		System.out.println("An error occured");
		
	}finally {
		
				System.out.println("Finally block executed");
			}
		}
	
	
	
}


