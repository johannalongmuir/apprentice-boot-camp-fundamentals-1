package checkout;

public class Product {

    private String name;
    private int price;
    private String receiptLine;

    public Product(String name, int price, String receiptLine) {
        this.name = name;
        this.price = price;
        this.receiptLine = receiptLine;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getReceiptLine() {
        return receiptLine;
    }

    public void setReceiptLine(String receiptLine) {
        this.receiptLine = receiptLine;
    }

    // TODO change this so not changing original price
    public void setPrice(int price) {
        this.price = price;
    }
}
