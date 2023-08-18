package exception_handling_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {
		//fileRead();
		fileRead2();

	}
	
	//this is the one way of checked exception handling
	public static void fileRead() {
		try {
		File file = new File("D:\\java-batch-june2023\\java-batch-june2023\\sample.txt");
		FileReader fr = new FileReader(file);
		} catch(NullPointerException e) {
			System.out.println("Please check index");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check index");
		} catch(FileNotFoundException e) {
			
		} finally {
			System.out.println("Exception handling completed");
		}
	}
	
	public static void fileRead2() throws FileNotFoundException {
	
		File file = new File("D:\\java-batch-june2023\\java-batch-june2023\\sample.txt");
		FileReader fr = new FileReader(file);
		
	}

}
