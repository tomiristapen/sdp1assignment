package Assignment4.Visitor;

// Класс, представляющий текстовый файл
public class TextFile implements File {
    private String name; // Имя файла

    public TextFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Метод для принятия посетителя
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Вызов соответствующего метода посетителя
    }
}

