package Day2;

import java.util.HashMap;

public class Prims_Algo {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_Algo(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
}
