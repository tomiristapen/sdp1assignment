package Assignment4.Visitor;

// Посетитель, выполняющий проверку файлов на вирусы
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверяем текстовый файл \"" + textFile.getName() + "\" на запрещенные слова.");
        // Логика проверки текста на запрещенные слова
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверяем исполняемый файл \"" + executableFile.getName() + "\" на наличие вредоносного кода.");
        // Логика проверки исполняемого файла
    }
}

