public class Latte implements Coffee {
    private String size;

    @Override
    public void prepare() {
        System.out.println("Приготовление Латте.");
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
