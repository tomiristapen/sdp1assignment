public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String content) {
        // Вызов метода рендеринга через переданный движок
        engine.render(content);
    }
}