package Assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    private String name;

    // Конструктор, принимающий имя подписчика
    public NewsSubscriberLaptop(String name) {
        this.name = name;
    }

    // Метод обновления, который вызывается при публикации новой новости
    @Override
    public void update(String category, String news) {
        // Если категория новости "Наука", то отправляем уведомление
        if ("Наука".equals(category)) {
            System.out.println(name + " (ноутбук) получил новость: " + news);
        }
    }
}
