package Files;

import java.io.File;

public class CreatingFolder {

	public static void main(String[] args) {
		//makeDirectory("srilatha");
		readFileNames("D:\\NewFilesFolder");
	}
	public static void readFileNames(String directory) {
		try {
			File file=new File(directory);
			if(file.isDirectory()) {
				String[] fileNames=file.list();
				for(String fileName:fileNames) {
					System.out.println(fileName);
				}
			}
			
		}catch(Exception ae) {
			
		}
	}
	
	
	
	public static void makeDirectory(String directoryName) {
	try {
		File file=new File(directoryName);
		boolean flag=file.mkdir();//File creation
		if(flag==true)System.out.println("Folder created Successfully");
		else System.out.println("Folder not created Successfully");
		
	}catch(Exception e) {
		System.out.println("due to some network issue folder creation failed");
	}finally {
		System.out.println("cleanup");
	}
	}

	public static void CreateFile() {
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

