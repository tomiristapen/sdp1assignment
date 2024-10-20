package Assignment4.Visitor;

// Интерфейс File, который определяет метод для принятия посетителя
public interface File {
    void accept(Visitor visitor); // Метод для принятия посетителя
}
