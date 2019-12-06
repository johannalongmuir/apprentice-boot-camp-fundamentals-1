package checkout;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ReceiptTests {

    @Test
    public void singleItem() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        assertThat(checkout.receipt()).containsSequence(
                "A: 50\n",
                "Total: 50");
    }
    
    @Test
    public void oneOfEach() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("C");
        checkout.scan("D");
        assertThat(checkout.receipt()).containsSequence(
                "A: 50\n",
                "B: 30\n",
                "C: 20\n",
                "D: 15\n",
                "Total: 115");
    }

    @Test
    public void offers() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("A");
        checkout.scan("C");
        checkout.scan("D");
        checkout.scan("B");
        assertThat(checkout.receipt()).containsSequence(
                "A: 50\n",
                "A: 50\n",
                "B: 30\n",
                "A: 50 - 20 (3 for 130)\n",
                "C: 20\n",
                "D: 15\n",
                "B: 30 - 15 (2 for 45)\n",
                "Total: 210");
    }

    @Test
    public void offers4C() {
        Checkout checkout = new Checkout();
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");

        assertThat(checkout.receipt()).containsSequence("C: 20\n",
                "C: 20\n",
                "C: 20\n",
                "C: 20 - 10 (4 for 70)\n",
                "Total: 70");
    }

    @Test
    public void offers5D() {
        Checkout checkout = new Checkout();
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        assertThat(checkout.receipt()).containsSequence("D: 15\n",
                "D: 15\n",
                "D: 15\n",
                "D: 15\n",
                "D: 15 - 15 (5 for 60)\n",
                "Total: 60");
    }
}
