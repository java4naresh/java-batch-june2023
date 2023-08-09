public class StringMethods {

	public static void main(String[] args) {
		String name = "Sriram";
		System.out.println(name);
		
		String updatedName = name.concat("Yanumula");
		System.out.println(updatedName);
		
		String name2 = "Srilatha";
		String name3 = "Srilatha";
		String name4 = "Srilatha";
		
		if(name2 == name3) {
			System.out.println("same");
		}
		if(name2 == name4) {
			System.out.println("same");
		}

		
		String name5 = new String("Srilatha");
		String name6 = new String("Srilatha");
		String name7 = new String("Srilatha");
		String name8="Srilatha";

		
		if(name5 == name8) {
			System.out.println("Same");
		}
	    name6 = name6.intern();
		if(name6 == name7) {
			System.out.println("Same");
		}

		if(name6.equals(name7)) {
			System.out.println("same");
		}
		if(name5.equals(name6)) {
			System.out.println("same");
		}

	}

}