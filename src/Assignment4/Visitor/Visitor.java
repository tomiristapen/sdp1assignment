package Assignment4.Visitor;

// Интерфейс Visitor, который определяет методы для взаимодействия с разными типами файлов
public interface Visitor {
    void visit(TextFile textFile);       // Метод для обработки текстового файла
    void visit(ExecutableFile executableFile); // Метод для обработки исполняемого файла
}
