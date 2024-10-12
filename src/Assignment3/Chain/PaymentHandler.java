package Assignment3.Chain;

public abstract class PaymentHandler {
    //next указывает на следующий обработчик в цепочке.
    protected PaymentHandler next;
    protected int balance;// balance хранит текущий баланс для этого обработчика.

    public PaymentHandler(int balance) {
        this.balance = balance;
    }

    // Метод setNext устанавливает следующий обработчик в цепочке и возвращает его,
    // чтобы можно было легко связать несколько обработчиков.
    public PaymentHandler setNext(PaymentHandler next) {
        this.next = next;
        return next;
    }

    // Метод для обработки платежа
    public abstract void pay(int amount);
}
