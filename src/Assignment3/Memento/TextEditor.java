package Assignment3.Memento;

public class TextEditor {
    private StringBuilder text; // Хранит текущее состояние текста

    // Конструктор, инициализирующий новый текстовый редактор
    public TextEditor() {
        text = new StringBuilder(); // Создаем новый объект StringBuilder для текста
    }

    public void addText(String newText) {
        text.append(newText); // Добавляем новый текст к текущему состоянию
    }

    public TextMemento saveState() {
        return new TextMemento(text.toString()); // Создаем и возвращаем новый снимок текущего состояния текста
    }

    public void restoreState(TextMemento memento) {
        text = new StringBuilder(memento.getText()); // Восстанавливаем текст из мему
    }

    public void printText() {
        System.out.println("Текущее состояние текста: " + text); // Печатаем текущее состояние текста
    }
}
