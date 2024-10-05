import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Метод для добавления документа в группу
    public void addDocument(Document document) {
        documents.add(document);
    }

    // Метод для удаления документа из группы
    public void removeDocument(Document document) {
        documents.remove(document);
    }

    // Метод для отображения всех документов в группе
    @Override
    public void display() {
        System.out.println("Отображение документов в группе:");
        for (Document document : documents) {
            document.display();
        }
    }
}
