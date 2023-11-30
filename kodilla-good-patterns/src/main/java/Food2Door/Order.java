package Food2Door;

public class Order {
    private Producer producer;
    private String product;
    private int quantity;

    public Order(Producer producer, String product, int quantity) {
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean process() {
        return producer.process(this);
    }
}