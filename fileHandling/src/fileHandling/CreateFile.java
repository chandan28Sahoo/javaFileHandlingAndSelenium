package fileHandling;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("/home/sahoo/Downloads/Telegram Desktop/test.txt");
			if(myObj.createNewFile()) {
				System.out.println("successfully created ...");
			}else {
				System.out.println("already exist...!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
