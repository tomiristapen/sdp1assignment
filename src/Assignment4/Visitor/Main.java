package Assignment4.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список файлов
        List<File> files = new ArrayList<>();
        files.add(new TextFile("document.txt")); // Текстовый файл
        files.add(new ExecutableFile("program.exe")); // Исполняемый файл

        // Создаем посетителей
        Visitor antivirusVisitor = new AntivirusVisitor(); // Посетитель для антивирусной проверки
        Visitor reportVisitor = new ReportVisitor(); // Посетитель для генерации отчета

        // Выполняем антивирусную проверку для всех файлов
        for (File file : files) {
            file.accept(antivirusVisitor); // Проверка файла антивирусом
        }

        // Генерируем отчёт о проверке для всех файлов
        for (File file : files) {
            file.accept(reportVisitor); // Генерация отчета
        }
    }
}

