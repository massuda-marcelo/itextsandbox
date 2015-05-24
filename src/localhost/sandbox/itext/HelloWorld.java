package localhost.sandbox.itext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorld {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {

		// adapted from "iText in Action"

		System.out.println("start...");
		// step 1
		Document document = new Document(PageSize.A4);
		// step 2
		PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
		// step 3
		document.open();
		// step 4
		document.add(new Paragraph("Hello World!"));
		// step 5
		document.close();

		System.out.println("finish");
	}
}
