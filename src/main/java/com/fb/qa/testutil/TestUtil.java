package com.fb.qa.testutil;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestUtil {

    public static long PAGE_LOAD_TIMEOUT = 10;
    public static long IMPLICIT_WAIT = 10;
    public static String TESTDATA_SHEET_PATH = "E:\\FacebookPageObjectModel\\src\\main\\java\\com\\fb\\qa\\testdata\\LoginDataSheet.xlsx";
    static Workbook book;
    static Sheet sheet;

    public static Object[][] getTestData(String sheetName) {

        FileInputStream file = null;
        try {
            file = new FileInputStream("E:\\FacebookPageObjectModel\\src\\main\\java\\com\\fb\\qa\\testdata\\LoginDataSheet.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            assert file != null;
//			XSSFWorkbook book = new XSSFWorkbook(file);

            book = WorkbookFactory.create(file);
            System.out.println(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
//		sheet = book.getSheet(sheetName);
        sheet = book.getSheetAt(0);
        System.out.println(sheet + "*********");
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                try {
                    data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }

//	public static void takeScreenshotAtEndOfTest() {
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		try {
//			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}