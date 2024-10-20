package Assignment4.Visitor;

// Посетитель, генерирующий отчёт о проверке
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Генерируем отчет по текстовому файлу \"" + textFile.getName() + "\".");
        // Логика генерации отчёта по текстовому файлу
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Генерируем отчет по исполняемому файлу \"" + executableFile.getName() + "\".");
        // Логика генерации отчёта по исполняемому файлу
    }
}

