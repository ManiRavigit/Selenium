package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.methods.PrimusBank;

public class DataDrivenTesting
{

	public static void main(String[] args) throws IOException
	{
		
		PrimusBank app=new PrimusBank();
		
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		
		app.appLogin("Admin", "Admin");
		
		File  srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sample");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i =1; i <=rcnt; i++) 
		{
			String bName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			
			
			System.out.println(bName+"------------"+add1);
			
			
			String results=app.branchCreation(bName, add1);
			
			ws.getRow(i).createCell(2).setCellValue(results);
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			
			wb.write(fos);
			
			
		}
		
		wb.close();
		
		app.appLogout();
		
		app.appClose();
 
	}

}
