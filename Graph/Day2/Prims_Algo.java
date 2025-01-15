package Day2;

import java.util.*;

public class Prims_Algo {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_Algo(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) { // Start from 1 to match vertex IDs
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class PrimsPair {
        int vtx;
        int acqvtx;
        int cost;

        public PrimsPair(int vtx, int acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Vertex: " + vtx + ", Acquired From: " + acqvtx + ", Cost: " + cost;
        }
    }

    public void Prims() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a, b) -> {
            return a.cost - b.cost;
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsPair(1, -1, 0)); // Start from vertex 1
        while (!pq.isEmpty()) {
            // 1. remove
            PrimsPair rp = pq.remove();
            // 2. ignore
            if (visited.contains(rp.vtx)) {
                continue;
            }
            // 3. mark visited
            visited.add(rp.vtx);
            // 4. selfwork
            System.out.println(rp);
            // 5. add unvisited neighbours
            for (int nbr : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbr)) {
                    pq.add(new PrimsPair(nbr, rp.vtx, map.get(rp.vtx).get(nbr)));
                }
            }
        }
    }

    public static void main(String[] args) {
        Prims_Algo pa = new Prims_Algo(7);
        pa.AddEdge(1, 2, 4);
        pa.AddEdge(1, 4, 7);
        pa.AddEdge(2, 3, 2);
        pa.AddEdge(4, 3, 5);
        pa.AddEdge(4, 5, 1);
        pa.AddEdge(6, 5, 3);
        pa.AddEdge(7, 5, 7);
        pa.AddEdge(7, 6, 2);
        pa.Prims();
    }
}
