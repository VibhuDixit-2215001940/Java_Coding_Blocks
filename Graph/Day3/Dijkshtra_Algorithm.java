package Day3;

import java.util.*;

public class Dijkshtra_Algorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkshtra_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v1).put(v1, cost);
    }

    class DijkstraPair {
        int vtx;
        String acqpath;
        int cost;

        public DijkstraPair(int vtx, String acqpath, int cost) {
            this.vtx = vtx;
            this.acqpath = acqpath;
            this.cost = cost;
        }

        public String toString() {
            return vtx + " " + acqpath + " @ " + cost;
        }
    }

    public void Dijsktra(int src) {
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2) {
                return o1.cost - o2.cost;
            }
        });
        pq.add(new DijkstraPair(src, "" + src, 0));
        while (!pq.isEmpty()) {
            // 1. remove
            DijkstraPair rp = pq.remove();
            // 2. ignore if already visited
            if (visited.contains(rp.vtx))
                continue;
            // 3. mark visited
            visited.add(rp.vtx);
            // 4. self work
            System.out.println(rp);
            // 5. add unvisited neighbours
            for (Map.Entry<Integer, Integer> entry : map.get(rp.vtx).entrySet()) {
                int vtx = entry.getKey();
                int cost = entry.getValue();
                String acqpath = rp.acqpath + " -> " + vtx;
                int newCost = rp.cost + cost;
                pq.add(new DijkstraPair(vtx, acqpath, newCost));
            }
        }
    }
}