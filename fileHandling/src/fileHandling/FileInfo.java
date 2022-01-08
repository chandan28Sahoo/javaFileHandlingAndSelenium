package fileHandling;
import java.io.*;
public class FileInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myObj = new File("/home/sahoo/Downloads/Telegram Desktop/testing.txt");
		
		if(myObj.exists()) {
			System.out.println("file name: " + myObj.getName());
			System.out.println("file location: " + myObj.getAbsolutePath());
			System.out.println("file writable: " + myObj.canWrite());
			System.out.println("file readable: " + myObj.canRead());
			System.out.println("file size: " + myObj.length());
		}else {
			System.out.println("file not exist...!");
		}
		
		
		/*
			System.out.println(myObj);
	        BufferedReader br = new BufferedReader(new FileReader(myObj));
		
		    // Declaring a string variable
		    String st;
		    // Condition holds true till
		    // there is character in a string
		    while ((st = br.readLine()) != null)
		
		        // Print the string
		        System.out.println(st);
		   */
	}

}
