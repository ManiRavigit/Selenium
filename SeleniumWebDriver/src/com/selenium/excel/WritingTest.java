package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest 
{

	public static void main(String[] args) throws IOException 
	{
		File  srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sample");
		
		
		ws.getRow(1).createCell(2).setCellValue("Saroj");
		ws.getRow(2).createCell(2).setCellValue("Mani");
		
		
		FileOutputStream fos=new FileOutputStream(srcFile);
		
		
		wb.write(fos);
		
		
		wb.close();
		
		
		
		

		

	}

}
