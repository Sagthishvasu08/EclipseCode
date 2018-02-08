package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src= new File("E:\\PatternObjectModel\\data\\TC001.xlsx");
		FileInputStream fis=new FileInputStream(src);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		/*String s1=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(s1);
		String s2=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(s2);*/
		int rowcount=sheet1.getLastRowNum();
		int colcount=sheet1.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colcount);
		for(int i=0;i<=rowcount;i++){
			for(int j=0;j<=colcount;j++){
				String A1=sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(A1);

			}
		}
	}

}
