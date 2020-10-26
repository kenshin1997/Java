package com.springapp.movie.service.export.bag;

import com.springapp.movie.entrys.form.BucketForm;
import com.springapp.movie.models.product.Product;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.springframework.stereotype.Service;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Service
public class BagExport  {

    public   DataSource getExcelData(BucketForm bucketForm) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        CreationHelper helper = workbook.getCreationHelper();
        HSSFSheet  sheet = workbook.createSheet("Customer Report");
        HSSFPatriarch drawing = sheet.createDrawingPatriarch();
        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Id");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Photo");

        int rowNum = 1;
         for(Product product : bucketForm.getProducts()){
             int tempRow = rowNum;
             int tempRow1 = rowNum;
             HSSFRow row = sheet.createRow(rowNum++);
             row.createCell(0).setCellValue(product.getId());
             row.createCell(1).setCellValue(product.getName());
             row.createCell(2);
             InputStream image = new URL("https://pngicon.ru/file/uploads/instagram-128x128.png").openStream();
             byte[] bytes = IOUtils.toByteArray(image);
             int picture = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
             image.close();
             ClientAnchor anchor = new HSSFClientAnchor();
             anchor.setCol1(2);
             anchor.setRow1(tempRow);
             anchor.setCol2(3);
             anchor.setRow2(++tempRow);
             HSSFPicture  hssfPicture = drawing.createPicture(anchor, picture);

//             hssfPicture.resize(0.3);
             short heightUnits = 60*15;
             int widthUnits = 20*256;
             sheet.setColumnWidth(2, widthUnits);
             for (int i = 0; i < 3; i++) {
             Cell cell = sheet.getRow(tempRow1).getCell(i);
             cell.getRow().setHeight(heightUnits);
             }
         }
        FileOutputStream fileOutputStream = new FileOutputStream("Order.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        DataSource dataSource = new FileDataSource("Order.xls");
        return dataSource ;
    }
}
