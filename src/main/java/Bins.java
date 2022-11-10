import java.util.LinkedHashMap;
import java.util.Map;

public class Bins {
    Map<Integer, Float> bm = new LinkedHashMap();

    public Bins() {
        bm.put(1, 1f);
    }

    public Bins(int start, int stop) {
        for (int i=start; i<=stop; i++) {
            bm.put(i, 1f);
        }
    }

    public Float getBin(int in) {
        return bm.get(in);
    }

    public void incrementBin(int in) {
        bm.put(in, bm.get(in)+1f);
    }
}
