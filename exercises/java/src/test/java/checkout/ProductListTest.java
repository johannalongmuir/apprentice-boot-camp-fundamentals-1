package checkout;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ProductListTest {

    @Test
    public void whenGivenAReturnAProduct() {
        String sku = "A";
        Product result = ProductList.createProduct(sku);
        Assertions.assertThat(result.getName()).isEqualTo("A");
        Assertions.assertThat(result.getPrice()).isEqualTo(50);
    }

    @Test
    public void whenGivenBReturnBProduct() {
        String sku = "B";
        Product result = ProductList.createProduct(sku);
        Assertions.assertThat(result.getName()).isEqualTo("B");
        Assertions.assertThat(result.getPrice()).isEqualTo(30);
    }

//    Add exception for Invalid Product
//    @Test
//    public void whenGivenInvalidProduct() {
//        String sku = "M";
//        Product result = ProductList.createProduct(sku);
//        Assertions.assertThat(result.getName()).isEqualTo("A");
//        Assertions.assertThat(result.getPrice()).isEqualTo(50);
//    }
}
