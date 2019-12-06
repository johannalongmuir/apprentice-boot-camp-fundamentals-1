package checkout;

public class ProductList {
    static Product createProduct(String sku) {
        Product product = null;
        if (sku.equals("A")) {
            product = new Product("A", 50, "A: 50\n");
        } else if (sku.equals("B")) {
            product = new Product("B", 30, "B: 30\n");
        } else if (sku.equals("C")) {
            product = new Product("C", 20, "C: 20\n");
        } else if (sku.equals("D")) {
            product = new Product("D", 15, "D: 15\n");
        } else {
            System.out.println("Invalid product");
        }
        return product;
    }
}
