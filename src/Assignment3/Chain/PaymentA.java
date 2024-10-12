package Assignment3.Chain;

public class PaymentA extends PaymentHandler {
    public PaymentA() {
        super(100); // Баланс для метода оплаты A
    }

    @Override
    public void pay(int amount) {
        // Если запрашиваемая сумма меньше или равна текущему балансу, то происходит оплата.
        if (amount <= balance) {
            System.out.println("Оплачено через Payment A: $" + amount);
        }
        // Если средств недостаточно и есть следующий обработчик, передаем запрос дальше по цепочке.
        else if (next != null) {
            System.out.println("Payment A недостаточно средств, передаем запрос дальше...");
            next.pay(amount);
        }
        // Если нет следующего обработчика, и ни один из методов оплаты не может покрыть сумму, выводим сообщение об ошибке.
        else {
            System.out.println("Все способы оплаты не могут покрыть сумму: $" + amount);
        }
    }
}
