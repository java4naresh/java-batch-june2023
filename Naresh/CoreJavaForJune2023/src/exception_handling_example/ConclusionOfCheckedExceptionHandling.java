package exception_handling_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConclusionOfCheckedExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		writeFiles();
		readFile1();
		readFile2();
		readFile3();

	}
	
	/*public static void writeFiles() throws FileNotFoundException {
		
			File file = new File("sample.txt");
			FileReader fr = new FileReader(file);
			
	}*/
	
	public static void writeFiles() {
		try {
		File file = new File("sample.txt");
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
	
	public static void readFile1() {
		System.out.println("File1 complted");
	}
	
   public static void readFile2() {
	   System.out.println("File2 complted");
	}
   
   public static void readFile3() {
	   System.out.println("File3 complted");
	}
	
	

}
