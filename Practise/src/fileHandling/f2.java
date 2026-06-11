package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class f2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\chand\\OneDrive\\Desktop\\PAN.jpg");
		FileInputStream fin = new FileInputStream(f1);
		byte[] arr = new byte[(int)f1.length()];
		fin.read(arr);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\chand\\OneDrive\\Desktop\\New folder\\PAN.jpg");
		fout.write(arr);
		fout.flush();
		
		System.out.println("Offered...Offered");
	}

}
