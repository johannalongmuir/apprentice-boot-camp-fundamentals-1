package checkout;

import java.util.ArrayList;
import java.util.List;

public class Total {
    protected static int total (List<Product> basketList) {
        int total = 0;
        for (Product a : basketList) {
            total += a.getPrice();
            // for receipt. System.out.println(a.getReceiptLine());
        }
        return total;
    }

}
