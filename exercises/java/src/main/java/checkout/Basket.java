package checkout;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    // add scan into here from checkout?

    protected static List<Product> addProduct (String sku, List<Product> basketList) {
        basketList.add(ProductList.createProduct(sku));
        return basketList;
    }
}
