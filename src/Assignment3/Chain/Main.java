package Assignment3.Chain;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры обработчиков платежей
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Устанавливаем цепочку обработчиков
        paymentA.setNext(paymentB).setNext(paymentC);

        // Сумма для оплаты
        int amountToPay = 210;

        // Пытаемся произвести оплату
        System.out.println("Попытка оплатить сумму: $" + amountToPay);
        paymentA.pay(amountToPay);
    }
}
