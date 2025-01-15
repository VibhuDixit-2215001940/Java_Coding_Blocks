package Day1;

import java.util.*;

public class Graph2 {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph2(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean hasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des)
            return true;
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                visited.add(nbrs);
                boolean ans = hasPath(nbrs, des, visited);
                if (ans)
                    return true;
            }
        }
        return false;
    }

    public void printAllPath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans + des);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printAllPath(nbrs, des, visited, ans + src);
            }
        }
        visited.remove(src);
    }

    public boolean bfs(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()) {
            // 1. remove
            int rv = q.poll();
            // 2. ignore if already visited
            if (visited.contains(rv))
                continue;
            // 3. Markvisited
            visited.add(rv);
            // 4. Self work
            if (rv == des)
                return true;
            // 5. Add unvisited
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs))
                    q.add(nbrs);
            }
        }
        return false;
    }

    public boolean dfs(int src, int des) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            // 1. remove
            int rv = st.pop();
            // 2. ignore if already visited
            if (visited.contains(rv))
                continue;
            // 3. Markvisited
            visited.add(rv);
            // 4. Self work
            if (rv == des)
                return true;
            // 5. Add unvisited
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs))
                    st.add(nbrs);
            }
        }
        return false;
    }

    public void bft(int des) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            q.add(src);
            while (!q.isEmpty()) {
                // 1. remove
                int rv = q.poll();
                // 2. ignore if already visited
                if (visited.contains(rv))
                    continue;
                // 3. Markvisited
                visited.add(rv);
                // 4. Self work
                System.out.println(rv + " ");
                // 5. Add unvisited
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.add(nbrs);
                }
            }
            System.out.println();
        }
    }
}