package checkout;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    static Product createProduct(String sku) {
        Product product = null;
        if ("A".equals(sku)) {
            product = new Product("A", 50, "A: 50\n");
        } else if ("B".equals(sku)) {
            product = new Product("B", 30, "B: 30\n");
        } else if ("C".equals(sku)) {
            product = new Product("C", 20, "C: 20\n");
        } else if ("D".equals(sku)) {
            product = new Product("D", 15, "D: 15\n");
        } else {
            System.out.println("invalid product");
        }
        return product;
    }
}
