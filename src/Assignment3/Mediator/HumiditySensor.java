package Assignment3.Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private String humidityData;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
        this.humidityData = "Влажность: 20%";  // Пример данных
    }

    @Override
    public void sendData() {
        System.out.println("сенсор влажности отправляет данные.");
        mediator.collectData(this);  // Отправляем данные через посредника
    }

    @Override
    public String getData() {
        return humidityData;  // Возвращаем данные с сенсора
    }
}
