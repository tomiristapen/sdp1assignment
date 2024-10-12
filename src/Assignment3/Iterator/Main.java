package Assignment3.Iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем коллекцию фильмов на основе списка
        List<String> movieList = Arrays.asList("Legally Blonde", "The Social Network", "10 Things I Hate About You ");
        ListMovieCollection listMovieCollection = new ListMovieCollection(movieList); // Инициализация коллекции фильмов
        Iterator<String> listIterator = listMovieCollection.createIterator(); // Создание итератора для списка

        System.out.println("Movies from List:");
        // Итерация по фильмам из списка и вывод на экран
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Создаем коллекцию фильмов на основе массива
        String[] movieArray = {"The Truman Show", "Mean Girls", "Fight Club"};
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(movieArray); // Инициализация коллекции фильмов
        Iterator<String> arrayIterator = arrayMovieCollection.createIterator(); // Создание итератора для массива

        System.out.println("\nMovies from Array:");
        // Итерация по фильмам из массива и вывод на экран
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
