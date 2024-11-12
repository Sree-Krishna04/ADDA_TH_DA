import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Charath", "123 Elm Street");
    }

    @Test
    public void testCustomerName() {
        assertEquals("Charath", customer.getName());
    }

    @Test
    public void testCustomerAddress() {
        assertEquals("123 Elm Street", customer.getAddress());
    }

    @Test
    public void testSetCustomerName() {
        customer.setName("Krishna");
        assertEquals("Krishna", customer.getName());
    }

    @Test
    public void testSetCustomerAddress() {
        customer.setAddress("456 Oak Street");
        assertEquals("456 Oak Street", customer.getAddress());
        System.out.println("CustomerTest success");
    }
}
