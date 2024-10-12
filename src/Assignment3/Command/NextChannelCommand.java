package Assignment3.Command;

public class NextChannelCommand implements Command {
    private Television television;
    // Конструктор, принимающий объект Television для управления
    public NextChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.nextChannel(); // Выполняем переключение на следующий канал
    }
}
