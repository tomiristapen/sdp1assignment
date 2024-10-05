package Assignment2.Facade;

import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Bridge.DocumentRenderer; // Необходимо импортировать этот класс

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
        renderer.render("Content of " + title); // Передаем контент документа для рендеринга
    }
}
//Задачи:
//Метод для отображения документа:
//Используйте фабрику документов, чтобы получить документ по заданному заголовку.
//Вызовите метод для отображения документа.

//Метод для отображения документа с водяным знаком:
//Получите документ по заголовку с помощью фабрики документов.
//Оберните полученный документ декоратором, который добавляет водяной знак.
//Вызовите метод для отображения обёрнутого документа.

//Метод для рендеринга документа:
//Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
//Вызовите метод рендеринга в рендерере для заданного документа.