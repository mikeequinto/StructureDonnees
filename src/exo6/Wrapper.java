package exo6;

import java.util.HashMap;
import java.util.Map;

public class Wrapper {
    private final int id;

    public Wrapper(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Wrapper && this.id == ((Wrapper) o).id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public static void main(String... args) {
        Map map = new HashMap();
        int limit = 10_000_000;
        for (int i = 0; i < limit; i++) {
            Wrapper w = new Wrapper(i);
            map.put(w, w.id);
        }
    }
}