package Assignment3.Iterator;

import java.util.List;

// Класс для коллекции фильмов на основе списка
public class ListMovieCollection {
    private List<String> movies; // Список фильмов

    // Конструктор, принимающий список фильмов
    public ListMovieCollection(List<String> movies) {
        this.movies = movies; // Инициализация поля movies
    }

    // Метод для создания итератора для коллекции фильмов
    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies); // Возвращает новый итератор
    }
}
