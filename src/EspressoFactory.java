public class EspressoFactory extends CoffeeFactory {
    // Переопределяем метод createCoffee() из абстрактного класса CoffeeFactory
    @Override
    public Coffee createCoffee() {
        // Создаем и возвращаем новый экземпляр класса Espresso
        return new Espresso();
    }
}
