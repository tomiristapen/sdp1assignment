import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        Cafe cafe = Cafe.getInstance();

        // Интерактивное меню для выбора типа кофе
        System.out.println("Добро пожаловать в кафе!");
        System.out.println("Выберите кофе:");
        System.out.println("1. Латте");
        System.out.println("2. Эспрессо");

        int choice = scanner.nextInt(); // Получаем выбор пользователя
        CoffeeFactory coffeeFactory = null;

        // В зависимости от выбора создаем нужную фабрику кофе
        switch (choice) {
            case 1:
                coffeeFactory = new LatteFactory();
                cafe.takeOrder("Латте");
                break;
            case 2:
                coffeeFactory = new EspressoFactory();
                cafe.takeOrder("Эспрессо");
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        // Создаем выбранный кофе
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.prepare();

        // Прототип — создаем и клонируем заказ
        Prototype originalOrder = new Prototype(coffee.getClass().getSimpleName(), "Средний");

        // Добавляем информацию о выбранных ингредиентах
        // Пример для Латте
        if (coffee instanceof Latte) {
            originalOrder.addIngredient("Обычное молоко");
            originalOrder.addIngredient("Ванильный сироп");
        } else if (coffee instanceof Espresso) {
            originalOrder.addIngredient("Вода");
            originalOrder.addIngredient("Кофе");
        }

        Prototype clonedOrder = (Prototype) originalOrder.clone();
        System.out.println("Клонированный заказ: " + clonedOrder);

        // Строитель — пользователь может создать кастомный кофе
        System.out.println("\nХотите создать кастомный кофе? (1 = да, 0 = нет)");
        int customChoice = scanner.nextInt();

        if (customChoice == 1) {
            Builderr builderr = new Builderr();
            System.out.println("Выберите тип кофе для кастомизации (1: Латте, 2: Эспрессо):");
            int customTypeChoice = scanner.nextInt();
            switch (customTypeChoice) {
                case 1:
                    builderr.setType("Латте");
                    break;
                case 2:
                    builderr.setType("Эспрессо");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
                    return;
            }

            System.out.println("Выберите размер (1: Маленький, 2: Средний, 3: Большой):");
            int sizeChoice = scanner.nextInt();
            switch (sizeChoice) {
                case 1:
                    builderr.setSize("Маленький");
                    break;
                case 2:
                    builderr.setSize("Средний");
                    break;
                case 3:
                    builderr.setSize("Большой");
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    return;
            }

            // Выбор молока
            System.out.println("Выберите молоко (1: Обычное, 2: Миндальное):");
            int milkChoice = scanner.nextInt();
            switch (milkChoice) {
                case 1:
                    builderr.setMilk(new RegularMilk());
                    break;
                case 2:
                    builderr.setMilk(new AlmondMilk());
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
                    return;
            }

            // Выбор сиропа
            System.out.println("Выберите сироп (1: Обычный, 2: Шоколадный):");
            int syrupChoice = scanner.nextInt();
            switch (syrupChoice) {
                case 1:
                    builderr.setSyrup(new VanillaSyrup());
                    break;
                case 2:
                    builderr.setSyrup(new ChocolateSyrup());
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
                    return;
            }

            Coffee customCoffee = builderr.build();
            customCoffee.prepare();
        } else {
            System.out.println("Спасибо за заказ!");
        }

        scanner.close();
    }
}