package model;

public class Toppings {
    private int id;
    private String type;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String Type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Toppings(int id, String type, int price) {
        this.id = id;
        this.type = type;
        this.price = price;


    }
}
