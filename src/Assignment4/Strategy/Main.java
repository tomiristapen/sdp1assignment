package Assignment4.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект для считывания ввода

        // Запрашиваем у пользователя сумму заказа
        System.out.print("Введите сумму заказа: ");
        double amount = scanner.nextDouble(); // Читаем сумму заказа

        // Создаем заказ
        Order order = new Order(amount);

        // Выводим доступные варианты оплаты
        System.out.println("Выберите метод оплаты:");
        System.out.println("1. Банковская карта (комиссия 2%)");
        System.out.println("2. Электронный кошелёк (без комиссии)");
        System.out.println("3. Наложенный платёж (доставка +300 рублей)");

        // Читаем выбор пользователя
        System.out.print("Введите номер метода оплаты (1-3): ");
        int choice = scanner.nextInt(); // Читаем выбор

        // Устанавливаем стратегию оплаты в зависимости от выбора пользователя
        switch (choice) {
            case 1:
                order.setPaymentStrategy(new CardPaymentStrategy());
                break;
            case 2:
                order.setPaymentStrategy(new WalletPaymentStrategy());
                break;
            case 3:
                order.setPaymentStrategy(new CashOnDeliveryStrategy());
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
                scanner.close(); // Закрываем сканер
                return; // Завершаем программу
        }

        // Выводим итоговую стоимость
        System.out.println("Итоговая стоимость: " + order.calculateTotal() + " рублей");

        scanner.close(); // Закрываем сканер
    }
}
