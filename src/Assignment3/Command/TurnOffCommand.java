package Assignment3.Command;

public class TurnOffCommand implements Command {
    private Television television; // Ссылка на объект телевизора

    // Конструктор принимает объект телевизора
    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff(); // Выключаем телевизор
    }
}
