package Assignment3.Chain;
public class PaymentB extends PaymentHandler {
    public PaymentB() {
        super(300); // Баланс для метода оплаты B
    }

    @Override
    public void pay(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена через Payment B: $" + amount);
        } else if (next != null) {
            System.out.println("Недостаточно средств на Payment B, перенаправляем запрос дальше");
            next.pay(amount);
        } else {
            System.out.println("Ни один из способов оплаты не может покрыть сумму: $" + amount);
        }
    }
}
