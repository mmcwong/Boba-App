package data;

public class Order {
    public final String description;
    public final String time;
    public Order(String order, String time) {
        this.description = order;
        this.time = time;
    }
}
