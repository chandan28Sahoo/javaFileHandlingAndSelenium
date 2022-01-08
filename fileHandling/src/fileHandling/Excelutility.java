package fileHandling;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelutility 
{
	public static String getReaddata(String path,int rowno,int colno)
	{
		String value="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(1);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
			
		} catch (Exception e)
		{
		System.out.println("Issue in Getread data "+e);
		}
		return value;
		
	}
	
	public static int getrowcount(String path)
	{
		int count=0;
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(1);
			count=sheet.getLastRowNum();
		} catch (Exception e) {
			System.out.println("Issue in Getrow count "+e);
		}
		return count;
	}
	public static void main(String[] args)
	{
		String path="/home/sahoo/eclipse-workspace/fileHandling/testData/Data_sheet.xlsx";
		for(int i=0;i<=getrowcount(path)-1;i++)
		{
			String value = getReaddata(path, i, 0);
			String value1 = getReaddata(path, i, 1);
			System.out.println(value+"      "+value1);
		}
	
	
	}
}
