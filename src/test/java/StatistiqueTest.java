import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class StatistiqueTest {
    @Test
    public void testMoyenne() {
        Calculatrice mockCalc = Mockito.mock(Calculatrice.class);

        Mockito.when(mockCalc.add(4.0f, 6.0f)).thenReturn(10.0f);
        Mockito.when(mockCalc.div(10.0f, 2)).thenReturn(5.0f);

        Statistique stat = new Statistique();
        stat.calculatrice = mockCalc;

        Assertions.assertEquals(5.0f, stat.moyenne(4.0f, 6.0f));
    }
}
