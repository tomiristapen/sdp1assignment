package Assignment3.Chain;
public class PaymentC extends PaymentHandler {
    public PaymentC() {
        super(1000);
    }

    @Override
    public void pay(int amount) {
        if (amount <= balance) {
            System.out.println("Оплачено через Payment C: $" + amount);
        } else if (next != null) {
            System.out.println("Payment C недостаточно средств, передаем запрос дальше...");
            next.pay(amount);
        } else {
            System.out.println("Все способы оплаты не могут покрыть сумму: $" + amount);
        }
    }
}
