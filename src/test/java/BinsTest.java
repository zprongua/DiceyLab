import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinsTest {
    @Test
    void testBins() {
        Bins bin1 = new Bins();
        Bins bin2 = new Bins(2, 12);
        Float exp = 2f;
        bin1.incrementBin(1);
        bin2.incrementBin(10);
        Float not = bin2.getBin(10);
        Float act = bin1.getBin(1);

        Assertions.assertEquals(exp, act);
        Assertions.assertEquals(exp, not);
    }
}