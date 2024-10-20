package Assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount;  // Итоговая стоимость без комиссии
    }
}
