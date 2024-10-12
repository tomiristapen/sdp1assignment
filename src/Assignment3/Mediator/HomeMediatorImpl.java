package Assignment3.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors;
    private List<String> collectedData;  // Список для хранения данных с сенсоров

    public HomeMediatorImpl() {
        this.sensors = new ArrayList<>();
        this.collectedData = new ArrayList<>();
    }

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);  // Регистрируем новый сенсор
    }

    @Override
    public void collectData(Sensor sensor) {
        String data = sensor.getData();
        collectedData.add(data);  // Собираем данные с сенсора
    }

    public void printReport() {
        System.out.println("Отчет по сенсорам:");
        for (String data : collectedData) {
            System.out.println(data);  // Выводим собранные данные
        }
    }
}
