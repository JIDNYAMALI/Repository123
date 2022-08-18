package com_SauceDemo_UtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet_Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			String address = "D:\\excelFile1.xlsx";
			FileInputStream file = new FileInputStream(address);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
//			XSSFSheet sheet= workbook.getSheet("April");	
//			XSSFRow row =  sheet.getRow(0);
//			XSSFCell cell = row.getCell(0);
//			String username= cell.getStringCellValue();
//			System.out.println("username is- "+username);
			
			//method chaining
			String cellData= workbook.getSheet("august").getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);
		}

	}


