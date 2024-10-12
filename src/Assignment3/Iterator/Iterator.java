package Assignment3.Iterator;

public interface Iterator<T> {
    // Метод для проверки наличия следующего элемента в коллекции
    boolean hasNext();

    // Метод для получения следующего элемента из коллекции
    T next();
}
