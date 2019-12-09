package checkout;

import java.util.List;

class Basket {

    static void addProduct(String sku, List<Product> basketList) {
        basketList.add(ProductList.createProduct(sku));
    }
}
