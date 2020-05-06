package task2;

import java.util.*;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_Write {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.navigate().to("http://www.w3schools.com/sql/sql_syntax.asp");
		wb.manage().window().maximize();
		System.out.println(wb.getTitle() + " - WebPage has been launched");

		List<WebElement> irows = wb.findElements(By.xpath("//*[@class='w3-table-all notranslate']/tbody/tr"));
		int iRowsCount = irows.size();
		List<WebElement> icols = wb.findElements(By.xpath("//*[@class='w3-table-all notranslate']/tbody/tr/th"));
		int iColsCount = icols.size();
		System.out.println("Selected web table has " + iRowsCount + " Rows and " + iColsCount + " Columns");
		System.out.println();

		FileOutputStream fos = new FileOutputStream("resources\\copyWebTable.xlsx");

		XSSFWorkbook wkb = new XSSFWorkbook();
		XSSFSheet sheet1 = wkb.createSheet("DataStorage");

		for (int i = 1; i <= iRowsCount; i++) {
			for (int j = 1; j <= iColsCount; j++) {
				if (i == 1) {
					WebElement val = wb.findElement(
							By.xpath("//*[@class='w3-table-all notranslate']/tbody/tr[" + i + "]/th[" + j + "]"));
					String a = val.getText();
					System.out.print(a);
					int count = 0;
					count = count + 1;
					XSSFRow excelRow = sheet1.createRow(i);
					XSSFCell excelCell = excelRow.createCell(count);
					// excelCell.setCellType(null);
					excelCell.setCellValue(a);

//wkb.write(fos);       
				} else {
					WebElement val = wb.findElement(
							By.xpath("//*[@class='w3-table-all notranslate']/tbody/tr[" + i + "]/td[" + j + "]"));
					String a = val.getText();
					System.out.print(a);
					int count = 0;
					count = count + 1;
					XSSFRow excelRow = sheet1.createRow(i);
					XSSFCell excelCell = excelRow.createCell(count);
					// excelCell.setCellType(null);
					excelCell.setCellValue(a);

//wkb.write(fos);       
				}
			}
			System.out.println();
		}
		fos.flush();
		wkb.write(fos);
		fos.close();
	}
}