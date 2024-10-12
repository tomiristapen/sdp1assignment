package Assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

// Класс, управляющий снимками состояния текста
public class Caretaker {
    private List<TextMemento> savedStates = new ArrayList<>(); // Список для хранения сохраненных снимков

    public void addMemento(TextMemento memento) {
        savedStates.add(memento); // Добавляем новый снимок в список
    }

    // Метод для получения снимка состояния по индексу
    public TextMemento getMemento(int index) {
        return savedStates.get(index); // Возвращаем снимок состояния по указанному индексу
    }
}
