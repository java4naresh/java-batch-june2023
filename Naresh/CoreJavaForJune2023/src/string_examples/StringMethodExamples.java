package string_examples;

import java.util.Arrays;

public class StringMethodExamples {

	public static void main(String[] args) {
		String name = "Naresh";
		char ch = name.charAt(0);
        //System.out.println(ch);
        //System.out.println(name.length());
       /* for(int i=0; i<name.length();i++) {
        	System.out.println(name.charAt(i));
        }*/
		//compareStrings("Naresh", "naresh");
		//containsCheck("My name is Naresh", "Srilatha");
		//conversion("NaResH", "Upper Lower");//naresh
		//emptyCheck(" ");
		//trimCheck(" Naresh Kambala ");
		splitCheck("Naresh Srilatha Shyamala Sathish", " ");
	}
	
	public static void compareStrings(String name1, String name2) {
		if(name1.equals(name2)) {
			System.out.println("same");
		} else System.out.println("not same");
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("same");
		} else System.out.println("not same");
	}
	
	public static void containsCheck(String paragraph, String search) {
		if(paragraph.contains(search)) {
			System.out.println("available");
		} else System.out.println("not available");
	}
	
	public static void conversion(String word, String action) {
		if(action.equals("upper")) {
			String convertedString = word.toUpperCase();
			System.out.println(convertedString);
		} else if(action.equals("lower")) {
			String convertedString = word.toLowerCase();
			System.out.println(convertedString);
		} else {
			System.out.println(word);
		}
	}
	
	public static void emptyCheck(String word) {
		if(word.trim().isEmpty()) {
			System.out.println("Given String is Empty");
		} else System.out.println("Given String is not Empty");
	}
	
	public static void trimCheck(String word) {
		System.out.println(word);
		System.out.println(word.trim());
	}
	
	public static void splitCheck(String word, String split) {
		String[] names = word.split(split);
		//System.out.println(Arrays.toString(names));
		for(String name:names) {
			System.out.println(name);
		}
	}

}
