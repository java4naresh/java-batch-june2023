package string_examples;

public class StringExample {

	public static void main(String[] args) {
		/*String name = "Naresh";//string literal
		System.out.println(name);//
		String updatedName = name.concat(" Kambala");//
		System.out.println(updatedName);//
		System.out.println(name);//*/
		
		/*String name2 = "Naresh";
		String name3 = "Naresh";
		String name4 = "Naresh";
		
		if(name2 == name3) {
			System.out.println("same");
		}
		if(name2 == name4) {
			System.out.println("same");
		}*/
		
		String name2 = new String("Naresh");
		String name3 = new String("Naresh");
		String name4 = new String("Naresh");
		String name5 = "Naresh";
		
		if(name2 == name5) {
			System.out.println("Same");
		}
	    name2 = name2.intern();
		if(name2 == name5) {
			System.out.println("Same");
		}
		
		if(name2.equals(name3)) {
			System.out.println("same");
		}
		if(name2.equals(name4)) {
			System.out.println("same");
		}
		

	}

}
