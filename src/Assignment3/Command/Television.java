package Assignment3.Command;
// Класс для управления телевизором
public class Television {
    public void turnOn() {
        System.out.println("Телевизор включен.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    public void volumeUp() {
        System.out.println("Громкость увеличена.");
    }

    public void volumeDown() {
        System.out.println("Громкость уменьшена.");
    }

    public void nextChannel() {
        System.out.println("Переключен на следующий канал.");
    }

    public void previousChannel() {
        System.out.println("Переключен на предыдущий канал.");
    }
}
