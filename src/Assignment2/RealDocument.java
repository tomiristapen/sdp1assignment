package Assignment2;

// Реальный документ, который требует загрузки
// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk(); // Загружаем документ при создании
    }

    private void loadFromDisk() {
        // Выводим сообщение о загрузке документа
        System.out.println("Загрузка документа \"" + title + "\" с диска...");
    }

    @Override
    public void display() {
        // Выводим сообщение об отображении документа
        System.out.println("Отображение документа: " + title);
    }
}


