package Assignment3.Iterator;

import java.util.List;

// Итератор для коллекции фильмов на основе списка
public class ListMovieIterator implements Iterator<String> {
    private List<String> movies; // Список фильмов
    private int position = 0; // Текущая позиция итератора

    // Конструктор, принимающий список фильмов
    public ListMovieIterator(List<String> movies) {
        this.movies = movies; // Инициализация поля movies
    }

    // Проверяет, есть ли следующий элемент в коллекции
    @Override
    public boolean hasNext() {
        return position < movies.size(); // Возвращает true, если есть следующий фильм
    }

    // Возвращает следующий фильм и перемещает итератор вперед
    @Override
    public String next() {
        if (hasNext()) {
            return movies.get(position++); // Возвращает текущий фильм и увеличивает позицию
        }
        return null; // Если следующего элемента нет, возвращает null
    }
}
