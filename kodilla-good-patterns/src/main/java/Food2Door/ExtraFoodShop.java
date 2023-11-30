package Food2Door;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(Order order) {
        return true;
    }
}