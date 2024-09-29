import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {
    private String coffeeType;
    private String size;
    private List<String> ingredients; // Добавляем список ингредиентов

    public Prototype(String coffeeType, String size) {
        this.coffeeType = coffeeType;
        this.size = size;
        this.ingredients = new ArrayList<>(); // Инициализация списка ингредиентов
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); // Метод для добавления ингредиента
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype cloned = (Prototype) super.clone();
        cloned.ingredients = new ArrayList<>(this.ingredients); // Клонирование списка ингредиентов
        return cloned;
    }

    @Override
    public String toString() {
        return "Заказ кофе: " + coffeeType + ", Размер: " + size + ", Ингредиенты: " + ingredients;
    }
}
