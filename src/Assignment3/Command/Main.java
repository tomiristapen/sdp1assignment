package Assignment3.Command;

public class Main {
    public static void main(String[] args) {
        // Создаем объект телевизора
        Television television = new Television();

        // Создаем команды для управления телевизором
        Command turnOn = new TurnOnCommand(television);
        Command turnOff = new TurnOffCommand(television);
        Command volumeUp = new VolumeUpCommand(television);
        Command volumeDown = new VolumeDownCommand(television);
        Command nextChannel = new NextChannelCommand(television);
        Command previousChannel = new PreviousChannelCommand(television);

        // Создаем пульт дистанционного управления
        RemoteControl remote = new RemoteControl();

        // Устанавливаем команды на пульте
        remote.setCommand("включить", turnOn);
        remote.setCommand("выключить", turnOff);
        remote.setCommand("увеличить громкость", volumeUp);
        remote.setCommand("уменьшить громкость", volumeDown);
        remote.setCommand("следующий канал", nextChannel);
        remote.setCommand("предыдущий канал", previousChannel);

        // Используем пульт для выполнения команд
        remote.buttonPressed("включить");
        remote.buttonPressed("увеличить громкость");
        remote.buttonPressed("следующий канал");
        remote.buttonPressed("уменьшить громкость");
        remote.buttonPressed("предыдущий канал");
        remote.buttonPressed("выключить");
    }
}
