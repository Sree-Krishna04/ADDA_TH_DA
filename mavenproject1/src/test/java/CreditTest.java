import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditTest {

    private Credit creditPayment;

    @BeforeEach
    public void setUp() {
        creditPayment = new Credit(200.0f, "Krishna", "Visa", "12/25");
    }
    
    @Test
    public void testAmount() {
        assertEquals(200.0f, creditPayment.getAmount(), 0.01);
        System.out.println("CreditTest success");
    }
}