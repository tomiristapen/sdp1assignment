package Assignment4.Template;

public abstract class QualityCheck {
    // Шаблонный метод, определяющий общий алгоритм проверки
    public final void performCheck() {
        checkAppearance(); // Шаг 1: Проверка внешнего вида
        checkSpecifics();  // Шаг 2: Проверка специфических характеристик (абстрактный метод)
        generateReport();   // Шаг 3: Заключительный отчёт
    }

    // Общий шаг для всех продуктов
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида продукта.");
    }

    // Абстрактный метод для проверки специфических характеристик
    protected abstract void checkSpecifics();

    // Общий шаг для всех продуктов
    private void generateReport() {
        System.out.println("Генерация заключительного отчёта.");
    }
}

