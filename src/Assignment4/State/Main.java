package Assignment4.State;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(); // Создаем экземпляр плеера

        // Демонстрация работы плеера
        player.play(); // Начинаем воспроизведение (переключение на состояние воспроизведения)
        player.pause(); // Ставим на паузу
        player.play(); // Возобновляем воспроизведение
        player.stop(); // Останавливаем воспроизведение
        player.pause(); // Пытаемся поставить на паузу (плеер уже остановлен)
    }
}

