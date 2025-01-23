package Day4;

import java.util.*;

public class BellMan_Ford {
    HashMap<Integer, HashMap<Integer, Integer>> mp = new HashMap<>();

    public BellMan_Ford(int v) {
        mp = new HashMap<>();
        for (int i = 0; i <= v; i++)
            mp.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int cost) {
        mp.get(v1).put(v2, cost);
        mp.get(v2).put(v1, cost);
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
        for (int e1 : mp.keySet()) {
            for (int e2 : mp.get(e1).keySet()) {
                int cost = mp.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void BellMan_Ford() {
        List<EdgePair> ll = getAllEdge();
        int v = mp.size();
        int[] dis = new int[v + 1];
        for (int i = 2; i < dis.length; i++)
            dis[i] = 98765432;
        for (int i = 1; i <= v; i++) {
            for (EdgePair e : ll) {
                if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
                    System.out.println("-ve wt cycle bhai!!");
                    return;
                }
                if (dis[e.e2] > dis[e.e1] + e.cost) {
                    dis[e.e2] = dis[e.e1] + e.cost;
                }
            }
        }
        for (int i = 1; i < dis.length; i++) {
            System.out.println(dis[i] + " ");
        }
    }
}