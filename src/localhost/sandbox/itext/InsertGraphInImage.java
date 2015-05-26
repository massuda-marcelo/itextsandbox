package localhost.sandbox.itext;

import java.awt.Graphics2D;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class InsertGraphInImage {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {

		System.out.println("start...");
		
		Document document = new Document(new Rectangle(150, 150));
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("PdfWithGraph.pdf"));
		document.open();
		PdfContentByte canvas = writer.getDirectContent();
		GraphExample graph = new GraphExample();
		Graphics2D g2 = canvas.createGraphics(150, 150);
		g2.setClip(50, 50, 50, 50);
		graph.paint(g2);
		g2.dispose();
		document.close();

		System.out.println("finish");
	}
}
