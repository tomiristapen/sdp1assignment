public class Cafe {
    private static Cafe instance;

    private Cafe() {}

    public static Cafe getInstance() {
        if (instance == null) {
            instance = new Cafe();
        }
        return instance;
    }

    public void takeOrder(String coffee) {
        System.out.println("Получен заказ на: " + coffee);
    }
}
