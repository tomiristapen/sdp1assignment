package Assignment4.State;

public class PlayingState implements PlayerState {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Плеер уже воспроизводит трек."); // Если плеер уже в воспроизведении, ничего не делаем
    }

    @Override
    public void pause() {
        System.out.println("Воспроизведение приостановлено."); // Приостанавливаем воспроизведение
        player.setState(new PausedState(player)); // Переключаемся на состояние паузы
    }

    @Override
    public void stop() {
        System.out.println("Воспроизведение остановлено."); // Останавливаем воспроизведение
        player.setState(new StoppedState(player)); // Переключаемся на состояние остановки
    }
}

