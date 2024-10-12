package Assignment3.Memento;

public class Main {
    public static void main(String[] args) {
        // Создаем новый текстовый редактор и менеджер для сохранения состояния
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Добавляем первый текст и сохраняем состояние
        editor.addText("Beshbarmak is the best.");
        editor.printText(); // Печатаем текущее состояние текста
        caretaker.addMemento(editor.saveState()); // Сохраняем текущее состояние

        editor.addText(" It's a traditional dish.");
        editor.printText(); // Печатаем текущее состояние текста
        caretaker.addMemento(editor.saveState()); // Сохраняем новое состояние

        editor.addText(" It reminds me of family gatherings");
        editor.printText(); // Печатаем текущее состояние текста

        editor.restoreState(caretaker.getMemento(1)); // Восстанавливаем текст до второго состояния
        editor.printText(); // Печатаем восстановленный текст

        editor.restoreState(caretaker.getMemento(0)); // Восстанавливаем текст до первого состояния
        editor.printText(); // Печатаем восстановленный текст
    }
}
