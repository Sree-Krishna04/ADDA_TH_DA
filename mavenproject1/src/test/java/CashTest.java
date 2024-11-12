import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashTest {

    private Cash cashPayment;

    @BeforeEach
    public void setUp() {
        cashPayment = new Cash(50.0f, 60.0f);
    }
    @Test
    public void testAmount() {
        assertEquals(50.0f, cashPayment.getAmount(), 0.01);
        System.out.println("CashTest success");
    }
}