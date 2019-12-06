package checkout;

import java.util.ArrayList;
import java.util.List;

class Checkout {
    // new basket object.
    // discount Class.
    // checkout
    // receipt

    private int total;
    private Receipt receipt = new Receipt();
    protected List<Product> basketList = new ArrayList<>();

    void scan(String sku) {
        Basket.addProduct(sku, basketList);
    }

    int total() {
        // static
        basketList = Discount.applyDiscount(basketList);
        total = Total.total(basketList);
        return total;
    }

//        tests bacically start from here
//        if ("A".equals(sku)) {
//            receipt.scannedA();
//        } else if ("B".equals(sku)) {
//            receipt.scannedB();
//        } else if ("C".equals(sku)) {
//            receipt.scannedC();
//        } else if ("D".equals(sku)) {
//            receipt.scannedD();
//        }


    public String receipt() {
        return receipt.text();
    }
}
