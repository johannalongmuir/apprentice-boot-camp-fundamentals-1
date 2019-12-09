package checkout;

import java.util.List;

class Discount {

    static void applyDiscount(List<Product> basketList) {
        int numberOfA = 0;
        int numberOfB = 0;
        int numberOfC = 0;
        int numberOfD = 0;

        for (Product a : basketList) {
            if ("A".equals(a.getName())) {
                numberOfA++;
                if (numberOfA % 3 == 0) {
                    a.setPrice(30);
                    a.setReceiptLine("A: 50 - 20 (3 for 130)\n");
                }
            } else if ("B".equals(a.getName())) {
                numberOfB++;
                if (numberOfB % 2 == 0) {
                    a.setPrice(15);
                    a.setReceiptLine("B: 30 - 15 (2 for 45)\n");
                }
            } else if ("C".equals(a.getName())) {
                numberOfC++;
                if (numberOfC % 4 == 0) {
                    a.setPrice(10);
                    a.setReceiptLine("C: 20 - 10 (4 for 70)\n");

                }
            } else if ("D".equals(a.getName())) {
                numberOfD++;
                if (numberOfD % 5 == 0) {
                    a.setPrice(0);
                    a.setReceiptLine("D: 15 - 15 (5 for 60)\n");
                }
            }
        }
    }
}
