// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    @Override
    public void display() {
        // Открываем и отображаем содержимое PDF-документа
        pdfDocument.openPDF();
        pdfDocument.showPDF();
    }
}
