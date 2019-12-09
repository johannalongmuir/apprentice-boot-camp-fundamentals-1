package checkout;

import java.util.ArrayList;
import java.util.List;

class Checkout {
    private int total;
    private Receipt receipt = new Receipt();
    protected List<Product> basketList = new ArrayList<>();



    void scan(String sku) {
        Basket.addProduct(sku, basketList);
    }

    int total() {
        basketList = Discount.applyDiscount(basketList);
        total = Total.total(basketList);
        return total;
    }

    public String receipt() {
        return receipt.receipt(basketList) + "Total: " + total;
    }
}
