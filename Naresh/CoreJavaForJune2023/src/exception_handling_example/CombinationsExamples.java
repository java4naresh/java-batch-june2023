package exception_handling_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CombinationsExamples {

	public static void main(String[] args) {
		
	}
	
	/*
	 *  this method will give valid combinations 
	 *   of checked exception handling
	 */
	public static void checkedValidCombination() {
		   // valid1
		   /* try {
			File file = new File("D:\\java-batch-june2023\\java-batch-june2023\\sample.txt");
			FileReader fr = new FileReader(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Exception handling completed");
			}*/
		
		try {
			File file = new File("D:\\java-batch-june2023\\java-batch-june2023\\sample.txt");
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void validCombination1() {
		try {
			String name = null;
			name.charAt(0);
			} finally {
				
		}
	}
	
	public static void validCombination2() {
		try {
			String name = null;
			name.charAt(0);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public static void invalidCombination1() {
		/*catch(Exception e) {
			
		} finally {
			
		}*/
	}
}
