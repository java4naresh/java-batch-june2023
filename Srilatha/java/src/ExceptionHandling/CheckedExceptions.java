package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
	
	
	public static void main(String args[])throws FileNotFoundException{
	fileRead();
  }
	

		public static void fileRead() throws FileNotFoundException{
		File file=new File("D:\\sample.txt");
		FileReader fr = new FileReader(file);
		

	}

}
