package ga.hzcgw.action;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/data/*")
public class PDFAction {

    @RequestMapping("pdf")
    public void createPDFData(HttpServletResponse response) throws Exception {
        response.setHeader("Content-Type", "application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=CGW.pdf");
        Document document = new Document(PageSize.A4, 10, 10, 50, 20);
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();
        Resource imageResource = new ClassPathResource("/images/img.png");
        Image image = Image.getInstance(imageResource.getFile().getAbsolutePath());
        image.scaleToFit(PageSize.A4.getWidth() / 2, PageSize.A4.getHeight());
        float pointX = (PageSize.A4.getWidth() - image.getScaledWidth()) / 2;
        float pointY = PageSize.A4.getHeight() - image.getHeight() - 100;
        image.setAbsolutePosition(pointX, pointY);
        document.add(image);
        document.add(new Paragraph("\n\n\n"));
        Resource fontResource = new ClassPathResource("/fonts/Alibaba-PuHuiTi-B.ttf");
        BaseFont baseFont = BaseFont.createFont(fontResource.getFile().getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        Font font = new Font(baseFont, 20, Font.NORMAL);
        String titles[] = new String[]{"CGW Software", "FinTech Company", "Let's Rock & Roll"};
        String contents[] = new String[]{"www.hzcgw.ga", "fin.hzcgw.ga", "video.hzcgw.ga"};
        for (int x = 0; x < titles.length; x++) {
            PdfPTable table = new PdfPTable(2);
            PdfPCell cell = new PdfPCell();
            cell.setPhrase(new Paragraph(titles[x], font));
            table.addCell(cell);
            cell = new PdfPCell();
            cell.setPhrase(new Paragraph(contents[x]));
            table.addCell(cell);
            document.add(table);
        }
        document.close();
    }
}
