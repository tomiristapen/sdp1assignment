package Assignment4.Observer;

// Интерфейс NewsPublisher для управления наблюдателями и публикацией новостей
public interface NewsPublisher {
    // Метод для добавления наблюдателя
    void addObserver(Observer observer);

    // Метод для удаления наблюдателя
    void removeObserver(Observer observer);

    // Метод для уведомления всех наблюдателей о новой новости
    void notifyObservers(String category, String news);

    // Метод для публикации новости и уведомления всех наблюдателей
    void publishNews(String category, String news);
}
