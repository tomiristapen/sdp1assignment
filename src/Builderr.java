public class Builderr {
    // Переменные для хранения параметров кофе
    private String type; // Тип кофе (Латте или Эспрессо)
    private String size; // Размер кофе
    private Milk milk;   // Молоко для кофе
    private Syrup syrup; // Сироп для кофе

    // Метод для установки типа кофе
    public void setType(String type) {
        this.type = type;
    }

    // Метод для установки размера кофе
    public void setSize(String size) {
        this.size = size;
    }

    // Метод для установки молока
    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    // Метод для установки сиропа
    public void setSyrup(Syrup syrup) {
        this.syrup = syrup;
    }

    // Метод для сборки и возврата объекта Coffee
    public Coffee build() {
        Coffee coffee;

        // Создаем кофе на основе типа, без передачи размера
        if ("Латте".equals(type)) {
            coffee = new Latte(); // Создаем объект Латте
        } else if ("Эспрессо".equals(type)) {
            coffee = new Espresso(); // Создаем объект Эспрессо
        } else {
            // Генерируем исключение в случае неверного типа кофе
            throw new IllegalArgumentException("Неверный тип кофе: " + type);
        }

        // Устанавливаем размер кофе, если метод setSize() реализован в классе Coffee
        coffee.setSize(size); // Предполагается, что метод setSize() существует в классе Coffee

        // Добавляем молоко, если оно выбрано
        if (milk != null) {
            milk.addMilk(); // Вызываем метод добавления молока
        }

        // Добавляем сироп, если он выбран
        if (syrup != null) {
            syrup.addSyrup(); // Вызываем метод добавления сиропа
        }

        return coffee; // Возвращаем собранный объект Coffee
    }
}

