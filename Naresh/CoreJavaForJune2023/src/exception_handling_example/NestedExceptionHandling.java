package exception_handling_example;

public class NestedExceptionHandling {

	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/0);//
			} catch (NumberFormatException e) {
				System.out.println("inside");
			} finally {
				System.out.println("inside finally");
			}
			String name = "Naresh";
			System.out.println(name.charAt(0));
		} catch (Exception e) {
			System.out.println("outside");
		} finally {
			System.out.println("outside finally");
		}

	}

}
