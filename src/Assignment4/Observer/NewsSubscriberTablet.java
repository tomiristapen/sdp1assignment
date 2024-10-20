package Assignment4.Observer;

public class NewsSubscriberTablet implements Observer {
    private String name;

    // Конструктор, принимающий имя подписчика
    public NewsSubscriberTablet(String name) {
        this.name = name;
    }

    // Метод обновления, который вызывается при публикации новой новости
    @Override
    public void update(String category, String news) {
        // Уведомляем пользователя о новой новости, независимо от категории
        System.out.println(name + " (планшет) получил новость: " + news);
    }
}
