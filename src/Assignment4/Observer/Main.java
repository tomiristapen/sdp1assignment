package Assignment4.Observer;

public class Main {
    public static void main(String[] args) {
        // Создаем издателя новостей
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone("Асель");
        Observer laptopSubscriber = new NewsSubscriberLaptop("Спанч Боб");
        Observer tabletSubscriber = new NewsSubscriberTablet("Гарри");

        // Добавляем подписчиков к издателю
        newsPublisher.addObserver(smartphoneSubscriber);
        newsPublisher.addObserver(laptopSubscriber);
        newsPublisher.addObserver(tabletSubscriber);

        // Публикуем новости
        newsPublisher.publishNews("Спорт", "Олимпияда по волейболу Япония vs Аргентина. Haikyu?");
        newsPublisher.publishNews("Наука", "Открыт новый вид бактерий, устойчивых к антибиотикам.");
        newsPublisher.publishNews("Политика", "Прошли выборы в парламент.");
    }
}

