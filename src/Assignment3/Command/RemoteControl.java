package Assignment3.Command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();// Хранит команды
    // Устанавливаем команду для конкретного действия
    public void setCommand(String action, Command command) {
        commands.put(action, command);
    }

    public void buttonPressed(String action) {
        Command command = commands.get(action);// Получаем команду по действию
        if (command != null) {
            command.execute(); // Выполняем команду
        } else {
            System.out.println("Неизвестная команда.");
        }
    }
}
