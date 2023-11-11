package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		s.createRow(0).createCell(0).setCellValue("abc");
		s.getRow(0).createCell(1).setCellValue("123");
		s.createRow(1).createCell(0).setCellValue("asfrgh");
		s.getRow(1).createCell(1).setCellValue("1234567");
		s.getRow(1).createCell(2).setCellValue("Ajith");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/testdata.xlsx");
		wb.write(fos);
		
		

	}

}
//for(int i=0;i<=s.getLastRowNum();i++) {
//	System.out.print(s.getRow(i).getCell(1) +"     "   );
//	System.out.println(s.getRow(i).getCell(0));
//}