package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Eligible_VoterDemo {
	static Scanner sc = new Scanner(System.in);
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public Eligible_VoterDemo(String path) throws IOException{
		fis = new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(1);
	}
	
	public static void EVM(String name,int input) throws IOException {
		if(input == 1) {
			System.out.println("Congrats "+ name + ", your vote is successfully submit to Congresss");
			System.out.println("Thanks for the vote..");
			System.out.println();
		}else if(input == 2) {
			System.out.println("Congrats "+ name + ", your vote is successfully submit to AAP");
			System.out.println("Thanks for the vote..");
			System.out.println();
		}else if(input == 3) {
			System.out.println("Congrats " + name +", your vote is successfully  submit to BJP");
			System.out.println("Thanks for the vote..");
			System.out.println();
		}else if(input == 4) {
			System.out.println("Congrats "+  name + ", your vote is successfully submit to SP");
			System.out.println("Thanks for the vote..");
			System.out.println();
		}else {
			System.out.println("wrong input!!");
			System.out.println();
		}
		main(null);
	}
	
	public static String readDataFromDB(int rowno,int colno) {
		String value = "";
		try {
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Issue in read data from db"+e);
		}
		return value;
	}
	
	public static int getrowcount()
	{
		int count=0;
		try {
			count=sheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			System.out.println("Issue in Getrow count "+e);
		}
		return count;
	}
	
	public static void checkVoterId(String voterId) throws IOException {
		for(int i=0;i<=getrowcount()-1;i++)
		{
			String value = readDataFromDB(i, 0);
			String value1 = readDataFromDB(i, 2);
			if(value1.equals(voterId)) {
				System.out.println();
				System.out.println("Congrats " + value  +", your record is found in my db");
				System.out.println("please enter the choice for vote, congress press 1, aap pres 2 bjp 3 and sp press 4");
				int choise = sc.nextInt();
				EVM(value,choise);
			}
		}
		System.out.println("This voter Id number is exist in our db .. ");
		System.out.println();
		main(null);
	}
	
	public static void checkAddharNum(String addharNo) throws IOException {

		for(int i=0;i<=getrowcount()-1;i++)
		{
			String value = readDataFromDB(i, 0);
			String value1 = readDataFromDB(i, 1);
			if(value1.equals(addharNo)) {
				System.out.println();
				System.out.println("Congrats " + value  +", your record is found in our db");
				System.out.println("please enter the choice for vote, congress press 1, aap pres 2 bjp 3 and sp press 4");
				int choise = sc.nextInt();
				EVM(value,choise);
			}
		}
		System.out.println("This aadhar number is not exist in our db .. ");
		System.out.println();
		main(null);
	}
	
	public static void checkAge(int age) throws IOException {
		try {
			if(age < 18) {
				throw new Exception("you are not eligible for vote");
			}else {
				System.out.println("please enter the choise aadhar press 1 or voter press 2 :");
				int input = sc.nextInt();
				if(input == 1) {
					System.out.println("Enter your addhar num....");
					String addharNo = sc.next();
					checkAddharNum(addharNo);
				}else if(input == 2) {
					System.out.println("Enter your voterId num....");
					String voterId = sc.next();
					checkVoterId(voterId);
				}else {
					System.out.println("wrong input..! ");
					System.out.println();
				}
				main(null);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			main(null);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="/home/sahoo/eclipse-workspace/fileHandling/testData/Data_sheet.xlsx";
		Eligible_VoterDemo ev = new Eligible_VoterDemo(path);
		System.out.println("Welcome to voting system. ");
		System.out.println("Please Enter your age ... ");
		int age = sc.nextInt();
		checkAge(age);
	}

}
