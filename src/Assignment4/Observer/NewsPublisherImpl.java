package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    // Список наблюдателей, подписанных на новости
    private List<Observer> observers = new ArrayList<>();

    // Метод для добавления наблюдателя
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод для уведомления всех наблюдателей о новой новости
    @Override
    public void notifyObservers(String category, String news) {
        for (Observer observer : observers) {
            observer.update(category, news);  // Уведомляем каждого наблюдателя
        }
    }

    // Метод для публикации новости и уведомления всех наблюдателей
    @Override
    public void publishNews(String category, String news) {
        System.out.println("Публикация новости в категории: " + category);
        notifyObservers(category, news);  // Уведомляем наблюдателей о новой новости
    }
}
