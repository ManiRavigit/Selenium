package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTest 
{

	public static void main(String[] args) throws IOException
	{

		File  srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sample");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 0; i <=rcnt; i++)
		{
			
			String data="";
			
			if(ws.getRow(i).getCell(0).getCellType()==CellType.NUMERIC)
			{
				int celldata=(int)ws.getRow(i).getCell(0).getNumericCellValue();
				
				 data=String.valueOf(celldata);
				
				
				
			}else
			{
				data=ws.getRow(i).getCell(0).getStringCellValue();
			}
			
			System.out.println(data);
			
		}
		
		

	}

}
