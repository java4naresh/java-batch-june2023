package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionProgram1 {

	public static void main(String[] args)throws FileNotFoundException,IOException{
		System.out.println("program execution starts");
		int firstNumber=9;
		int secondNumber=0;
		int result=0;
		
		File file=new File("D:\resume.docx");
		FileInputStream fi=new FileInputStream(file);
		System.out.println(fi);
		
		try {
			result= firstNumber/secondNumber;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			throw ae;
		}
		finally {
			System.out.println("Finally block executed");
		}
		System.out.println("output is: "+result);
		System.out.println("program execution is end");
	}

}
