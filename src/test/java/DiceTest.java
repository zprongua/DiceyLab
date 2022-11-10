import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testRollTotal() {
        Dice die = new Dice();
        Dice normal = new Dice(2);
        Dice yahtzee = new Dice(5);

        int dieTotal = die.rollTotal();
        int normalTotal = normal.rollTotal();
        int yahtzeeTotal = yahtzee.rollTotal();

        Assert.assertTrue(dieTotal>=1);
        Assert.assertTrue(normalTotal>=2);
        Assert.assertTrue(yahtzeeTotal>=5);
    }
}