package fileHandling;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class VotingDemoo 
{
	 static String path="D:\\JavaWorkspace\\10Novermber_6_30NewjavaBatch\\Testdata\\Data_sheet.xlsx";
	public static void getvotingUtility()
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the name");
			String name = sc.next();
			System.out.println("Please enter the age");
			int age = sc.nextInt();
			if(age<18)
			{
				throw new Exception("not eligible ");
			}
			else
			{
				System.out.println("Please enter the choice \n"
						+ "aadhar press 1 \n"
						+ "voter card press 2");
				int choice = sc.nextInt();
				if(choice==1)
				{
					
					System.out.println("Please enter the aadhar number");
					
					ArrayList<String> aadharnum = getReaddata(1);
					String aadharnumber = sc.next();
					for(String dd:aadharnum)
					{
						if(dd.equals(aadharnumber))
						{
							System.out.println("congrts ! your record is found in my DB");
							System.out.println("Please enter choice congress press 1 \n"
									+ "BJP press 2 \n"
									+ "AAP press 3 \n"
									+ "NOTA press 4 \n");
							int votingchoice = sc.nextInt();
						
						if(votingchoice==1)
						{
							System.out.println("your vote to submitted to congress");
						}
						else if(votingchoice==2)
						{
							System.out.println("your vote to submitted to BJP");
						}
						}
					}
				}
				else if(choice==2)
				{

					System.out.println("Please enter the voter number");
					ArrayList<String> voternum = getReaddata(1);
					String voter = sc.next();
					
				}
				else
				{
					throw new Exception("input is not valid");
				}
				
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
			getvotingUtility();
		}
	}
	public static ArrayList<String> getReaddata(int choice)
	{
		ArrayList<String>li=new ArrayList<String>();
		try 
		{
			FileInputStream fis= new FileInputStream(path);
			XSSFWorkbook wb  = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			if(choice==1)
			{
				for(int i=1;i<=10;i++)
				{
				String data = sheet.getRow(i).getCell(0).getStringCellValue();
				li.add(data);
				}
			}
			else if(choice==2)
			{
				if(choice==1)
				{
					for(int i=1;i<=10;i++)
					{
					String data = sheet.getRow(i).getCell(1).getStringCellValue();
					li.add(data);
					}
				}
			}
		} catch (Exception e) 
		{
			
		}
		return li;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		getvotingUtility();
	}
}