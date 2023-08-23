package Files;

import java.io.File;

public class CreatingFolder {

	public static void main(String[] args) {
		//makeDirectory("srilatha");
		//readFileNames("D:\\Srilatha");
		checkAndCreateFile("D:/Srilatha","Bangaru");
	}
	
	public static void checkAndCreateFile(String dir, String fileName) {
		try {
			File file=new File(dir);
			if(file.isDirectory()) {
				String[] fileNames=file.list();
				boolean flag=false;
				for(String fileName1:fileNames) {
					if(fileName1.equals(fileName)) {
						flag=true;
					}
				}
			if(flag) {
				System.out.println("File Already Available");
			}else {
				CreateFile(dir+"\\"+fileName);
			}
			
			}else {
			throw new InvalidDirectory_Exception("please provide valid Directory");
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
	}
	}
	
	
	

	public static void readFileNames(String directory) {
		try {
			File file=new File(directory);
			if(file.isDirectory()) {
				String[] fileNames=file.list();
				for(String fileName:fileNames) {
					System.out.println(fileName);
				}
			}else {
				Boolean flag=file.mkdir();
				if(flag)System.out.println("folder is created Succesfully");
				else System.out.println("folder is not created Succesfully");
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

	public static void CreateFile(String name) {
		try {
			File file=new File(name);
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

