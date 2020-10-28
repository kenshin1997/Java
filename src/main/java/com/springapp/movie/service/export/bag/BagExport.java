package com.springapp.movie.service.export.bag;

import com.springapp.movie.entrys.form.BucketForm;
import com.springapp.movie.models.photo.Photo;
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
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BagExport  {

    public   DataSource getExcelData(BucketForm bucketForm) throws IOException {
        short heightUnits = 80*15; //inaltimea  celulei
        int widthUnits =15*256; // lungimea celulei
        HSSFWorkbook workbook = new HSSFWorkbook();
        CreationHelper helper = workbook.getCreationHelper();
        HSSFSheet  sheet = workbook.createSheet("Customer Report");
        HSSFPatriarch drawing = sheet.createDrawingPatriarch();
        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Model");
        header.createCell(1).setCellValue("Color");
        header.createCell(2).setCellValue("Quantity");
        header.createCell(3).setCellValue("Price");
        header.createCell(4).setCellValue("Photo");

        int rowNum = 1;float totals = 0;
         for(Product product : bucketForm.getProducts()){
             int tempRow = rowNum;
             int tempRow1 = rowNum;
             totals += product.getDescription().getOrders() * product.getDescription().getPrice();
             HSSFRow row = sheet.createRow(rowNum++);
             row.createCell(0).setCellValue(product.getName());
             row.createCell(1).setCellValue(product.getDescription().getColor());
             row.createCell(2).setCellValue(product.getDescription().getOrders());
             row.createCell(3).setCellValue(product.getDescription().getPrice());
             row.createCell(4);
             Optional<Photo>  URl = product.getPhotos().stream().filter(photo -> photo.isMain()).findFirst();
             InputStream image = new URL(URl.get().getUrl()).openStream();
             byte[] bytes = IOUtils.toByteArray(image);
             int picture = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
             image.close();
             ClientAnchor anchor = new HSSFClientAnchor();
             anchor.setCol1(4); // coloana 3
             anchor.setRow1(tempRow);
             anchor.setCol2(5); // pina la coltul coloanei 4
             anchor.setRow2(++tempRow);
             HSSFPicture  hssfPicture = drawing.createPicture(anchor, picture);

//           hssfPicture.resize(0.3);
             sheet.setColumnWidth(4, widthUnits); // coloana 5
             for (int i = 0; i < bucketForm.getProducts().size(); i++) { // pentru toate rindurile
             Cell cell = sheet.getRow(tempRow1).getCell(i);
             cell.getRow().setHeight(heightUnits);
             }
         }
        HSSFRow row = sheet.createRow(rowNum+=2);
        row.createCell(5).setCellValue("Totals:");
        row.createCell(6).setCellValue(totals);
        HSSFRow information = sheet.createRow(rowNum++);

        FileOutputStream fileOutputStream = new FileOutputStream("Order.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        DataSource dataSource = new FileDataSource("Order.xls");
        return dataSource ;
    }
}
