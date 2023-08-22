package Files;

import java.io.File;

public class Creating_File2 {

	public static void main(String[] args) {
		try {
			File file=new File("src\\Files\\Srilatha.txt");
			boolean flag=file.createNewFile();//File creation
			if(flag==true)System.out.println("File created Successfully");
			else System.out.println("File not created Successfully");
			
		}catch(Exception e) {
			System.out.println("due to some network issue file creation failed");
		}finally {
			System.out.println("cleanup");
		}
		}
	
	}

