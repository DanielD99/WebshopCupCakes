package business.services;

public class Bottom {
    private int bottom_id;
    private String name;

    public Bottom(int bottom_id, String name) {
        this.bottom_id = bottom_id;
        this.name = name;
    }

    public int getBottom_id() {
        return bottom_id;
    }

    public void setBottom_id(int bottom_id) {
        this.bottom_id = bottom_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
