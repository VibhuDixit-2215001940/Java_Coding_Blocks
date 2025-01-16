import java.util.*;

public class Kruskal_Algorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Kruskal_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v1).put(v1, cost);
    }

    class EdgePair {
        int e1;
        int e2;
        int cost;

        public EdgePair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }

    public List<EdgePair> getAllEdge() {
        List<EdgePair> ll = new ArrayList<>();
        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void Kruskal() {
        List<EdgePair> ll = getAllEdge();
        Collections.sort(ll, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost - o2.cost;
            }
        });
        DSU dsu = new DSU();
        for (int v : map.keySet()) {
            dsu.Create(v);
        }
        int ans = 0;
        for (EdgePair e : ll) {
            int rn1 = dsu.find(e.e1);
            int rn2 = dsu.find(e.e2);
            if (rn1 == rn2) {
                // show that the graph contains the cycle
            } else {
                dsu.union(rn1, rn2);
                ans += e.cost;
            }
        }
        System.out.println(ans);
    }
}