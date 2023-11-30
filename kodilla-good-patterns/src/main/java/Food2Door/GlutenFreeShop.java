package Food2Door;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        return true;
    }
}