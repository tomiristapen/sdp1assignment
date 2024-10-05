package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Класс-прокси для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        // Загружаем реальный документ только при первом вызове
        if (realDocument == null) {
            realDocument = new RealDocument(title);
        }
        realDocument.display();
    }
}




