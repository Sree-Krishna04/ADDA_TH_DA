import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class OrderTest {

    private Order order;
    private Item item;
    private OrderDetail orderDetail;

    @BeforeEach
    public void setUp() {
        item = new Item(2.0f, "Test Item");
        order = new Order(new Date(), "Pending");
        orderDetail = new OrderDetail(3, "Taxable", item);
        order.addOrderDetail(orderDetail);
    }

    @Test
    public void testCalcSubTotal() {
        assertEquals(30.0f, order.calcSubTotal(), 0.01);
    }

    @Test
    public void testCalcTax() {
        assertEquals(3.0f, order.calcTax(), 0.01);
    }

    @Test
    public void testCalcTotal() {
        assertEquals(33.0f, order.calcTotal(), 0.01);
    }

    @Test
    public void testCalcTotalWeight() {
        assertEquals(6.0f, order.calcTotalWeight(), 0.01);
        System.out.println("OrderTest success");
    }
}