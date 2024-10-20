package Assignment4.State;

public class Player {
    private PlayerState currentState; // Текущее состояние плеера

    public Player() {
        currentState = new StoppedState(this); // Изначально плеер в состоянии остановки
    }

    // Метод для переключения состояния
    public void setState(PlayerState state) {
        currentState = state; // Устанавливаем новое состояние
    }

    // Делаем делегирование команд текущему состоянию
    public void play() {
        currentState.play(); // Делегируем действие текущему состоянию
    }

    public void pause() {
        currentState.pause(); // Делегируем действие текущему состоянию
    }

    public void stop() {
        currentState.stop(); // Делегируем действие текущему состоянию
    }
}

