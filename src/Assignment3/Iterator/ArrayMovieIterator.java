package Assignment3.Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies; // Массив фильмов
    private int position = 0; // Текущая позиция итератора

    // Конструктор, принимающий массив фильмов
    public ArrayMovieIterator(String[] movies) {
        this.movies = movies; // Инициализация массива фильмов
    }

    // Метод для проверки наличия следующего элемента
    @Override
    public boolean hasNext() {
        return position < movies.length; // Возвращает true, если есть еще элементы для обхода
    }

    // Метод для получения следующего элемента
    @Override
    public String next() {
        if (hasNext()) { // Проверка на наличие следующего элемента
            return movies[position++]; // Возвращаем текущий элемент и увеличиваем позицию
        }
        return null; // Если элементов больше нет, возвращаем null
    }
}
