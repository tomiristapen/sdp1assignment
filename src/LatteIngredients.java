public class LatteIngredients implements Ingredients {
    // Метод для создания молока
    @Override
    public Milk createMilk() {
        // Возвращает экземпляр обычного молока для латте
        return new RegularMilk();
    }

    // Метод для создания сиропа
    @Override
    public Syrup createSyrup() {
        // Возвращает экземпляр ванильного сиропа для латте
        return new VanillaSyrup();
    }
}
