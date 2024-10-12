package Assignment3.Mediator;

public class Main {
    public static void main(String[] args) {
        // Создаем посредника (умный дом)
        HomeMediator mediator = new HomeMediatorImpl();

        // Создаем сенсоры и регистрируем их у посредника
        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        mediator.registerSensor(tempSensor);
        mediator.registerSensor(humiditySensor);
        mediator.registerSensor(lightSensor);

        // Сенсоры отправляют данные
        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Печатаем отчет по собранным данным
        ((HomeMediatorImpl) mediator).printReport();
    }
}
