package Assignment3.Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private String lightData;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
        this.lightData = "освещённость: 200";  // Пример данных
    }

    @Override
    public void sendData() {
        System.out.println("сенсор света отправляет данные");
        mediator.collectData(this);  // Отправляем данные через посредника
    }

    @Override
    public String getData() {
        return lightData;  // Возвращаем данные с сенсора
    }
}
