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
		//splitCheck("Naresh Srilatha Shyamala Sathish", " ");
		//startsWithCheck("Naresh", "Naresh");//true
		//endsWithCheck("Naresh", "ha");
		//indexOfCheck("Srilatha", 'a');//4
		//lastIndexOfCheck("SrilathaNa", 'a');//7
		//replaceCheck("sathish", 's', 'n');//Nathish
		//replaceAllCheck("Naresh12Java45@*", "[^a-zA-Z]", "");
		substringCheck("Srilatha Bangaru Shyamala");
	}
	
	public static void substringCheck(String word) {
		System.out.println(word.substring(9, 16));
		System.out.println(word.substring(9));
	}
	
	public static void replaceAllCheck(String word, String ex, String newS) {
		word = word.replaceAll(ex, newS);
		System.out.println(word);
	}
	
	public static void replaceCheck(String word, char oldC, char newC) {
		//word = word.replace(oldC, newC);
		//word = word.replace("S", "N");//
		word = word.replaceFirst("s", "n");
		System.out.println(word);
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
	
	public static void startsWithCheck(String word, String ex) {
		if(word.startsWith(ex)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	public static void endsWithCheck(String word, String ex) {
		if(word.endsWith(ex)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	public static void indexOfCheck(String word, char ch) {
		System.out.println(word.indexOf(ch));
	}
	
	public static void lastIndexOfCheck(String word, char ch) {
		System.out.println(word.lastIndexOf(ch));
		System.out.println(word.lastIndexOf("a"));
		System.out.println(word.lastIndexOf(ch, 6));
		System.out.println(word.lastIndexOf("a", 6));
		//int i = Math.min(6, word.length() - 1);
		//System.out.println(i);
	}

}
