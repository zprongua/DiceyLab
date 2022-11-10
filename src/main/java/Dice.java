import java.util.ArrayList;
import java.util.List;

public class Dice {
    int nod = 0;
    List<Integer> numUp = new ArrayList<Integer>();

    public Dice() {
        nod = 1;
    }

    public Dice(int numberOfDice) {
        nod = numberOfDice;
    }

    public int rollTotal() {
        int total = 0;
        rollDice();
        for (Integer i : numUp) {
            total += i;
        }
        numUp.clear();
        return total;
    }

    public void rollDice() {
        for (int i=0; i<nod; i++) {
            numUp.add((int) (Math.random()*6+1));
        }
    }
}
