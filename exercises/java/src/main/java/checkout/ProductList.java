package checkout;

public class ProductList {
    static Product createProduct(String sku) {
        Product product = null;
        switch (sku) {
            case "A":
                product = new Product("A", 50, "A: 50\n");
                break;
            case "B":
                product = new Product("B", 30, "B: 30\n");
                break;
            case "C":
                product = new Product("C", 20, "C: 20\n");
                break;
            case "D":
                product = new Product("D", 15, "D: 15\n");
                break;
            default:
                System.out.println("Invalid product");
                break;
        }
        return product;
    }
}
