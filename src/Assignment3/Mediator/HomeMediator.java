package Assignment3.Mediator;

public interface HomeMediator {
    void registerSensor(Sensor sensor);  // Метод для регистрации сенсора
    void collectData(Sensor sensor);  // Метод для сбора данных с сенсора
}
