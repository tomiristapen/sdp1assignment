package Assignment4.State;

// Интерфейс для состояний плеера
public interface PlayerState {
    void play();   // Метод для начала воспроизведения
    void pause();  // Метод для приостановки воспроизведения
    void stop();   // Метод для остановки воспроизведения
}

