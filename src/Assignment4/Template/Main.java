package Assignment4.Template;

public class Main {
    public static void main(String[] args) {
        // Создаем проверку для продуктов питания
        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Проверка продукта питания:");
        foodCheck.performCheck(); // Запускаем процесс проверки

        System.out.println(); // Для разделения выводов

        // Создаем проверку для электроники
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Проверка электроники:");
        electronicsCheck.performCheck(); // Запускаем процесс проверки
    }
}

