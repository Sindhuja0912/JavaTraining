package packageone;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 



public class ExcelInteraction {

	public static void main(String[] args) {
		ArrayList<String> x=readFromExcel("D:\\SeleniumAppiumTraining\\TestSheet.xls", "Sheet1", 1, 1);
		for(int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i));
		}
	
	}
	
	public static ArrayList<String>  readFromExcel(String filepath,String sheetName,int row, int col)
	{
		String sdata;
		ArrayList<String> aList=new ArrayList<String>();
		try {
			File src=new File(filepath);
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sh1=wb.getSheet(sheetName);
			int iCol=0;
			do
			{
				sdata=sh1.getRow(row).getCell(col).getStringCellValue();
				iCol=iCol+1;
				aList.add(sdata);
				
			}while(!sdata.equals(""));
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			sdata=null;
		}
		return aList;
	}
	

}
