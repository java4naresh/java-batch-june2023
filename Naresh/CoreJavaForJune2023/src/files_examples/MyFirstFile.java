package files_examples;

import java.io.File;

public class MyFirstFile {

	public static void main(String[] args) {
		//makeDirectory("srilatha");
		//readFileNames("D:\\naresh");
		checkAndCreateFile("D:\\ghhjghj", "srilatha");
	}
	
	public static void checkAndCreateFile(String dir, String inputFileName) {
		try {
			File file = new File(dir);
			if(file.isDirectory()) {
				String[] fileNames = file.list();
				boolean flag = false;
				for(String fileName:fileNames) {
					if(fileName.equals(inputFileName)) {
						flag = true;
					}
				}
				if(flag) {
					System.out.println("File Already Available");
				} else {
					createFile(dir+"\\"+inputFileName);
				}
			} else {
				throw new InvalidDirectoryException("Please Provide Valid Directory");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void readFileNames(String directory) {
		try {
			File file = new File(directory);
			if(file.isDirectory()) {
				String[] fileNames = file.list();
				for(String fileName:fileNames) {
					System.out.println(fileName);
				}
			} else {
				boolean flag = file.mkdir();
				if(flag) System.out.println("Folder Created Successfully");
				else System.out.println("Folder not Created Successfully");
			}
		} catch(Exception e) {
			
		}
	}
	
	public static void makeDirectory(String directoryName) {
		try {
			File file = new File(directoryName);
			boolean flag = file.mkdir();
			if(flag) System.out.println("Folder Created Successfully");
			else System.out.println("Folder not Created Successfully");
			
		} catch (Exception e) {
			System.out.println("due to some networrk issue Folder creation failed");
		} finally {
			System.out.println("cleanup");
		}
	}
	
	public static void createFile(String name) {
		try {
			File file = new File(name);
			boolean flag = file.createNewFile();
			if(flag) System.out.println("File Created Successfully");
			else System.out.println("File not Created Successfully");
			
		} catch (Exception e) {
			System.out.println("due to some networrk issue file creation failed");
		} finally {
			System.out.println("cleanup");
		}
	}

}
