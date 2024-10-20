package Assignment4.Strategy;


public class CardPaymentStrategy implements PaymentStrategy {
    private static final double COMMISSION_RATE = 0.02;  // Комиссия 2%

    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + (orderAmount * COMMISSION_RATE);  // Итоговая стоимость с комиссией
    }
}

