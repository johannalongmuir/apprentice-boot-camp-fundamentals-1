package checkout;

public class ScannerForProduct {

    static Product scan(String sku) {
        // get product list from name.

        Product product = null;
        if ("A".equals(sku)) {
            product = new Product("A", 50);
        } else if ("B".equals(sku)) {
            product = new Product("B", 30);
        } else if ("C".equals(sku)) {
            product = new Product("C", 20);
        } else if ("D".equals(sku)) {
            product = new Product("D", 15);
        }
        return product;
    }
}
