package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\DELL\\Desktop\\Write_Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("User_Details").createRow(0).createCell(0).setCellValue("Email");

		wb.getSheet("User_Details").getRow(0).createCell(1).setCellValue("Password");

		wb.getSheet("User_Details").createRow(1).createCell(0).setCellValue("Ashok");

		wb.getSheet("User_Details").getRow(1).createCell(1).setCellValue("Ashok@123");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		System.out.println("Excel sheet created successfully");

	}

}
