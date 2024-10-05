// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {

    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    @Override
    public void display() {
        // Сначала отображаем сам документ
        decoratedDocument.display();
        // Затем добавляем водяной знак
        addWatermark();
    }

    private void addWatermark() {
        System.out.println("Добавление водяного знака...");
    }
}
