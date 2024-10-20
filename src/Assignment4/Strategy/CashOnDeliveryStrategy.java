package Assignment4.Strategy;


public class CashOnDeliveryStrategy implements PaymentStrategy {
    private static final double DELIVERY_FEE = 300;  // Стоимость доставки

    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + DELIVERY_FEE;  // Итоговая стоимость с дополнительной платой за доставку
    }
}

