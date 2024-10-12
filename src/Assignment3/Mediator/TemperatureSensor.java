package Assignment3.Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private String temperatureData;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
        this.temperatureData = "Температура: 30°C";  // Пример данных
    }

    @Override
    public void sendData() {
        System.out.println("Температурный сенсор отправляет данные.");
        mediator.collectData(this);  // Отправляем данные через посредника
    }

    @Override
    public String getData() {
        return temperatureData;  // Возвращаем данные с сенсора
    }
}
