package Day2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//We have to just find if any Odd length cycle is present in the graph or not .......if yes present then not a bipartite other wise yes bipartite!!!
//For odd length cycle we need to find the number of nodes in the graph that are already present in queu but of diff distance!!
public class IsBipartite {
    public static void main(String[] args) {
        int[][] graph = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
        // Solution obj = new Solution();
        // System.out.println(obj.isBipartite(graph));
    }

    class Solution {
        public boolean isBipartite(int[][] graph) {
            Queue<BipartitePair> q = new LinkedList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int vtx = 0; vtx < graph.length; vtx++) {
                if (map.containsKey(vtx))
                    continue;
                q.add(new BipartitePair(vtx, 0));
                // BFS
                while (!q.isEmpty()) {
                    // 1. remove
                    BipartitePair rp = q.remove();
                    // 2. Ignore
                    if (map.containsKey(rp.vtx)) {
                        if (map.get(rp.vtx) != rp.dis)
                            return false;
                        continue;
                    }
                    // 3. Add visited
                    map.put(rp.vtx, rp.dis);
                    // 5. Add unvisited neighbours
                    for (int nbrs : graph[rp.vtx]) {
                        if (!map.containsKey(nbrs))
                            q.add(new BipartitePair(nbrs, rp.dis + 1));
                    }
                }
            }
            return false;
        }
    }

    class BipartitePair {
        int vtx;
        int dis;

        public BipartitePair(int vtx, int dis) {
            this.vtx = vtx;
            this.dis = dis;
        }
    }
}
