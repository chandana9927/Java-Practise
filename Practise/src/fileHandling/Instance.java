package fileHandling;

import java.io.*;

public class Instance {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\chand\\OneDrive\\Desktop\\File\\doc.txt");
		if(f1.mkdirs()) {
			System.out.println("Folder Created");
		}
		else {
			System.out.println("Folder is not created");
		}
		if(f1.exists()) {
			System.out.println("Folder exists");
		}
		else {
			System.out.println("Folder doesn't exists");
		}
		if(f1.delete()) {
			System.out.println("Folder deleted");
		}
		else {
			System.out.println("Folder doesn't exists");
		}
		if(f1.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File not created");
		}
		FileWriter fw = new FileWriter(f1);
		fw.write("Hi \n");
		fw.write("Howdy?\n");
		fw.append("Charley\n");
		fw.append("This is a good file program");
//		fw.close();
//		fw.append("This is after closing");
		fw.flush();
		System.out.println("This is the data in a file");
		
		FileReader fr = new FileReader(f1);
		char[] ch = new char[(int)f1.length()];
		fr.read(ch);
		String s1 = new String(ch);
		System.out.println(s1);
//		fr.close();
	}

}
