package checkout;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ScannerForProductTest {

    @Test
    public void whenGivenAReturnAProduct() {
        String sku = "A";
        Product result = ScannerForProduct.scan(sku);
        Assertions.assertThat(result.getName()).isEqualTo("A");
        Assertions.assertThat(result.getPrice()).isEqualTo(50);
    }

    @Test
    public void whenGivenBReturnBProduct() {
        String sku = "B";
        Product result = ScannerForProduct.scan(sku);
        Assertions.assertThat(result.getName()).isEqualTo("B");
        Assertions.assertThat(result.getPrice()).isEqualTo(30);
    }
}
