public class LatteFactory extends CoffeeFactory {
    // Метод создания кофе
    @Override
    public Coffee createCoffee() {
        // Создает и возвращает новый экземпляр Latte
        return new Latte();
    }
}
