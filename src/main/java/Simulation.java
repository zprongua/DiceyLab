public class Simulation {
    Dice d;
    Bins b;
    Float tosses;
    String plural;
    String[] stars;

    public Simulation(int die, Float toss) {
        d = new Dice(die);
        if (die>1) {
            b = new Bins(die, die*6);
            plural = "dice";
        }
        else {
            b = new Bins();
            plural = "die";
        }
        tosses = toss;
    }

    public void runSimulation() {
        int total;
        for (int i=1; i<=tosses; i++) {
            total = d.rollTotal();
            b.incrementBin(total);
        }
    }

    public String printResults() {
        makeStars();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append(String.format("Simulation of %s %s for %s times\n\n", d.nod, plural, tosses));
        for (int i = d.nod; i<=d.nod*6; i++) {
            sb.append(String.format("%2s: %7.0f: %.2f %s", i, b.getBin(i), b.getBin(i)/tosses, stars[count]+"\n"));
            count++;
        }
        return String.valueOf(sb);
    }

    public void makeStars() {
        stars = new String[(d.nod*6)-d.nod+1];
        int middle = ((d.nod*6 - d.nod)/2);
        String three = "***";
        String star = three;
        int j = stars.length-1;
        for (int i=0; i<=middle; i++) {
            stars[i] = star;
            stars[j] = star;
            j--;
            star += three;
        }
    }
}
