package Assignment4.State;

public class PausedState implements PlayerState {
    private Player player;

    public PausedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение возобновлено."); // Возобновляем воспроизведение
        player.setState(new PlayingState(player)); // Переключаемся на состояние воспроизведения
    }

    @Override
    public void pause() {
        System.out.println("Плеер уже на паузе."); // Если плеер уже на паузе, ничего не делаем
    }

    @Override
    public void stop() {
        System.out.println("Воспроизведение остановлено."); // Останавливаем воспроизведение
        player.setState(new StoppedState(player)); // Переключаемся на состояние остановки
    }
}

