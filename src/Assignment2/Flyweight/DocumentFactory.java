package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument;
import java.util.HashMap;
import java.util.Map;
//Flyweight
// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    public static Document getDocument(String title) {
        // Проверяем, есть ли уже документ с таким заголовком
        if (!documentMap.containsKey(title)) {
            // Если нет, создаем новый документ
            Document newDocument = new RealDocument(title);
            documentMap.put(title, newDocument);
        }
        // Возвращаем существующий или новый документ
        return documentMap.get(title);
    }
}
