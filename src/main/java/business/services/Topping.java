package business.services;

public class Topping {
    private int topping_id;
    private String name;

    public Topping(int topping_id, String name) {
        this.topping_id = topping_id;
        this.name = name;
    }

    public int getTopping_id() {
        return topping_id;
    }

    public void setTopping_id(int topping_id) {
        this.topping_id = topping_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
