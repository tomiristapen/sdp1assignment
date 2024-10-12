package Assignment3.Iterator;

public class ArrayMovieCollection {
    private String[] movies; // Массив фильмов

    // Конструктор, принимающий массив фильмов
    public ArrayMovieCollection(String[] movies) {
        this.movies = movies; // Инициализация массива фильмов
    }

    // Метод для создания итератора, который будет использоваться для обхода коллекции фильмов
    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies); // Возвращаем новый итератор для массива фильмов
    }
}
