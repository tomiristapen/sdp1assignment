package Assignment4.Observer;

// Интерфейс Observer, который должен реализовать каждый
public interface Observer {
    // Метод, который будет вызываться для уведомления подписчика
    void update(String category, String news);
}
