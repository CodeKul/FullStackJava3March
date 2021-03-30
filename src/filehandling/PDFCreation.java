package filehandling;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFCreation {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("sample.doc"));
            document.open();
            pdfWriter.open();

            Paragraph paragraph = new Paragraph("Today is saturday");
            document.add(paragraph);

            document.close();
//            pdfWriter.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }
}
