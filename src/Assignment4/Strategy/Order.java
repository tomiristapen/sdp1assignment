package Assignment4.Strategy;


public class Order {
    private double amount;  // Сумма заказа
    private PaymentStrategy paymentStrategy;  // Текущая стратегия оплаты

    public Order(double amount) {
        this.amount = amount;  // Инициализируем сумму заказа
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;  // Устанавливаем стратегию оплаты
    }

    public double calculateTotal() {
        if (paymentStrategy != null) {
            return paymentStrategy.calculateFinalAmount(amount);  // Рассчитываем итоговую стоимость
        } else {
            throw new IllegalArgumentException("Стратегия оплаты не установлена.");
        }
    }
}

