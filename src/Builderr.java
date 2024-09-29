public class Builderr {
    private String type;
    private String size;
    private Milk milk;
    private Syrup syrup;

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public void setSyrup(Syrup syrup) {
        this.syrup = syrup;
    }

    public Coffee build() {
        Coffee coffee;

        // Create the coffee without passing size
        if ("Латте".equals(type)) {
            coffee = new Latte(); // Create Latte
        } else if ("Эспрессо".equals(type)) {
            coffee = new Espresso(); // Create Espresso
        } else {
            throw new IllegalArgumentException("Неверный тип кофе: " + type);
        }

        // Set the size (if your Coffee class has a method to set size, implement it)
        coffee.setSize(size); // Assuming you have a setSize() method in Coffee class

        // Adding milk and syrup if they are selected
        if (milk != null) {
            milk.addMilk();
        }
        if (syrup != null) {
            syrup.addSyrup();
        }

        return coffee;
    }
}
