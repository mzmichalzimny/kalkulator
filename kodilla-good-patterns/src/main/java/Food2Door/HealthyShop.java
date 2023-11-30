package Food2Door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        return true;
    }
}