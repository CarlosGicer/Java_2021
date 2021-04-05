package poo_t7.pdfbox;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class EjemploPDFBox {

	public static void main(String[] args) throws IOException {
		
		try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 22);
            contentStream.newLineAtOffset( 20,  page.getMediaBox().getHeight() - 22);
            contentStream.showText("Hello World!");
            contentStream.endText();

            ArrayList<String> prueba = new ArrayList<>();
            prueba.add("Línea 1 ---- 1");
            prueba.add("Línea 2 ---- 1");
            prueba.add("Línea 3 ---- 1");
            prueba.add("Línea 4 ---- 1");
            prueba.add("Línea 5 ---- 1");
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
            contentStream.newLineAtOffset( 20,  page.getMediaBox().getHeight() - 55);
            contentStream.setLeading(15);
            for( String s : prueba) {
            	//contentStream.newLineAtOffset( 0, -15);
            	contentStream.newLine();
                contentStream.showText(s);
            }
            contentStream.endText();	
            
            // Image
            PDImageXObject image = PDImageXObject.createFromByteArray(document, EjemploPDFBox.class.getResourceAsStream("ejemplo.png").readAllBytes(), "Java Logo");
            contentStream.drawImage(image, 200, 350, image.getWidth() / 4, image.getHeight() / 4);

            contentStream.close();

            document.save("document.pdf");
        }
    
	}

}
