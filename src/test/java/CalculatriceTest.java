import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAdd() {
        Assertions.assertEquals(5.0f, calc.add(2.0f, 3.0f));
    }

    @Test
    public void testDiv() {
        Assertions.assertEquals(2.0f, calc.div(6.0f, 3.0f));
    }

    @Test
    public void testDivByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(5.0f, 0));
    }

    @Test
    public void testMult() {
        Assertions.assertEquals(6.0f, calc.mult(2.0f, 3.0f));
    }

    @Test
    public void testMinus() {
        Assertions.assertEquals(1.0f, calc.minus(4.0f, 3.0f));
    }

    @Test
    public void testMinusNegative() {
        Assertions.assertEquals(-2.0f, calc.minus(1.0f, 3.0f));
    }
}
