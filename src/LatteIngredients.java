public class LatteIngredients implements Ingredients {
    @Override
    public Milk createMilk() {
        return new RegularMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}
