public class Espresso implements Coffee {
    private String size;

    @Override
    public void prepare() {
        System.out.println("Приготовление Эспрессо.");
        // Additional preparation steps...
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSize() {
        return size;
    }
}
