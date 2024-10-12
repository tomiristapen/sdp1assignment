package Assignment3.Memento;

public class TextMemento {
    private final String text; // Сохраняем текст как финальное поле, чтобы его нельзя было изменить

    public TextMemento(String text) {
        this.text = text; // Инициализируем поле text значением, переданным в конструктор
    }

    public String getText() {
        return text; // Возвращаем сохраненное состояние текста
    }
}
