
// Фасад для работы с документами
public class DocumentFacade {
    private DocumentFactory documentFactory;

    public DocumentFacade() {
        documentFactory = new DocumentFactory(); // Инициализация фабрики документов
    }

    // Метод для отображения документа
    public void displayDocument(String title) {
        Document document = documentFactory.getDocument(title); // Получаем документ по заголовку
        document.display(); // Отображаем документ
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        Document document = documentFactory.getDocument(title); // Получаем документ по заголовку
        Document watermarkedDocument = new WatermarkDecorator(document); // Оборачиваем документ в декоратор для добавления водяного знака
        watermarkedDocument.display(); // Отображаем документ с водяным знаком
    }

    // Метод для рендеринга документа
    public void renderDocument(String title, RenderEngine engine) {
        Document document = documentFactory.getDocument(title); // Получаем документ по заголовку
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine); // Создаем рендерер с выбранным движком
        renderer.render(document.toString()); // Рендерим документ
    }
}
