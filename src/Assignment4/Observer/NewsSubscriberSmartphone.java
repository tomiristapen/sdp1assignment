package Assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer {
    private String name;

    // Конструктор, принимающий имя подписчика
    public NewsSubscriberSmartphone(String name) {
        this.name = name;
    }

    // Метод обновления, который вызывается при публикации новой новости
    @Override
    public void update(String category, String news) {
        // Если категория новости "Спорт", то отправляем уведомление
        if ("Спорт".equals(category)) {
            System.out.println(name + " (смартфон) получил новость: " + news);
        }
    }
}
