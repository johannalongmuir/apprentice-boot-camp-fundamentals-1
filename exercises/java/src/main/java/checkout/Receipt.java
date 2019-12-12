package checkout;

import java.util.List;

class Receipt {
    StringBuilder receipt(List<Product> basketList) {
        StringBuilder receipt = new StringBuilder();
        for (Product a : basketList) {
            receipt.append(a.getReceiptLine());
        }
        return receipt;
    }
}
