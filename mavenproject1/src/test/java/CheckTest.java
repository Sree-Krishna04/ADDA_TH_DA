import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckTest {

    private Check checkPayment;

    @BeforeEach
    public void setUp() {
        checkPayment = new Check(100.0f, "Charath", "Bank123");
    }
    @Test
    public void testAmount() {
        assertEquals(100.0f, checkPayment.getAmount(), 0.01);
        System.out.println("CheckTest success");
    }
}