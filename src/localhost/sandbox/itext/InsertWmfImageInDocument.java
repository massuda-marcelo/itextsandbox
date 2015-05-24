package localhost.sandbox.itext;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

public class InsertWmfImageInDocument {

	public static void main(String[] args) throws DocumentException, IOException {

		System.out.println("start...");

		Document document = new Document(PageSize.A4);
		PdfWriter.getInstance(document, new FileOutputStream("PdfWithWmfImage.pdf"));
		document.open();

		Image wmf = Image.getInstance("res/image.wmf", /*recoverFromImageError*/ false);
        wmf.scaleToFit(1000, 72);

        document.add(wmf);

        document.close();

		System.out.println("finish");
	}
}
