package Assignment4.State;

public class StoppedState implements PlayerState {
    private Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение начато с начала."); // Начинаем воспроизведение с начала трека
        player.setState(new PlayingState(player)); // Переключаемся на состояние воспроизведения
    }

    @Override
    public void pause() {
        System.out.println("Плеер остановлен, ничего не происходит."); // Нельзя поставить на паузу, если плеер остановлен
    }

    @Override
    public void stop() {
        System.out.println("Плеер уже остановлен."); // Если плеер уже остановлен, ничего не делаем
    }
}

