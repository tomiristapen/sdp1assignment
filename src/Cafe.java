public class Cafe {
    // Статическая переменная для хранения единственного экземпляра Cafe
    private static Cafe instance;

    // Закрытый конструктор, чтобы предотвратить создание объектов извне
    private Cafe() {}

    // Метод для получения единственного экземпляра Cafe
    public static Cafe getInstance() {
        // Проверяем, существует ли уже экземпляр
        if (instance == null) {
            // Если экземпляр еще не создан, создаем его
            instance = new Cafe();
        }
        return instance; // Возвращаем единственный экземпляр
    }

    // Метод для обработки заказа на кофе
    public void takeOrder(String coffee) {
        // Выводим сообщение о получении заказа
        System.out.println("Получен заказ на: " + coffee);
    }
}
