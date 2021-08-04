package mypackage_selenium;


import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.IntStream;

class Data_Driven_Test_Apache {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\GOKUL\\Desktop\\Book3.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(file);

        XSSFSheet sheet = wb.getSheet("Sheet3");
        int row_count = sheet.getLastRowNum();


        int col_count = sheet.getRow(0).getLastCellNum();
        System.out.println(row_count+" "+col_count);

        IntStream r_num = IntStream.range(0,row_count+1);
        IntStream c_num = IntStream.range(0,col_count);

        int [] num2 = c_num.toArray();
        int [] num1 = r_num.toArray();
        for (int i : num1){
            for( int c : num2){
                XSSFCell data = sheet.getRow(i).getCell(c);
                System.out.print(data+"\t");
            }
            System.out.println();
        }

//        for (int r =0;r<=row_count;r++){
//            for(int c = 0;c<=col_count;c++){
//                XSSFRow row_data = sheet.getRow(r);
//                System.out.print(row_data.getCell(c)+"\t");
//            }
//            System.out.println("\n");
//        }


    }
}
