import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderDetailTest {

    private Item item;
    private OrderDetail orderDetail;

    @BeforeEach
    public void setUp() {
        item = new Item(2.0f, "Test Item");
        orderDetail = new OrderDetail(3, "Taxable", item);
    }

    @Test
    public void testCalcSubTotal() {
        assertEquals(30.0f, orderDetail.calcSubTotal(), 0.01);
    }

    @Test
    public void testCalcTax() {
        assertEquals(3.0f, orderDetail.calcTax(), 0.01);
    }

    @Test
    public void testCalcWeight() {
        assertEquals(6.0f, orderDetail.calcWeight(), 0.01);
        System.out.println("OrderDetailTest success");
    }
}