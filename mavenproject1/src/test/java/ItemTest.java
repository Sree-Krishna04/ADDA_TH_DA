import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item(2.0f, "Test Item");
    }

    @Test
    public void testGetPriceForQuantity() {
        assertEquals(30.0f, item.getPriceForQuantity(3), 0.01);
    }

    @Test
    public void testGetTax() {
        assertEquals(1.0f, item.getTax(), 0.01);
    }

    @Test
    public void testInStock() {
        assertTrue(item.inStock());
    }

    @Test
    public void testGetShippingWeight() {
        assertEquals(2.0f, item.getShippingWeight(), 0.01);
        System.out.println("ItemTest success");
    }
}