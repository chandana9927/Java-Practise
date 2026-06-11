package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\chand\\OneDrive\\Desktop\\File\\doc.txt");
		FileWriter fw = new FileWriter(f1,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("Hi");
		bw.newLine();
		bw.write("Howdy?");
		bw.newLine();
		bw.append("Charley");
		bw.newLine();
		bw.append("This is a good file program");
		bw.newLine();
//		fw.close();
//		fw.append("This is after closing");
		bw.flush();
		System.out.println("This is the data in a file");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		while(s1!=null) {
			System.out.println(s1);
			s1 = br.readLine();
		}
		}

}
