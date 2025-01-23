package Day4;

import java.util.*;

public class TopologicalSort {
    private HashMap<Integer, List<Integer>> mp = new HashMap<>();

    public TopologicalSort(int v) {
        for (int i = 0; i < v; i++) {
            mp.put(i, new ArrayList<>());
        }
    }

    public void AddEdge(int v1, int v2) {
        mp.get(v1).add(v2);
    }

    public int[] inDegree() {
        int[] in = new int[mp.size()];
        for (int v1 : mp.keySet()) {
            for (int v2 : mp.get(v1)) {
                in[v2]++;
            }
        }
        return in;
    }

    public void TopologicalSort() {
        int[] in = inDegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int r = q.poll();
            System.out.print(r + " ");
            for (int nbrs : mp.get(r)) {
                in[nbrs]--;
                if (in[nbrs] == 0) {
                    q.add(nbrs);
                }
            }
        }
    }

    public static void main(String[] args) {
        TopologicalSort ts = new TopologicalSort(8);
        ts.AddEdge(1, 2);
        ts.AddEdge(1, 0);
        ts.AddEdge(1, 4);
        ts.AddEdge(4, 3);
        // ts.AddEdge(3, 2);
        ts.AddEdge(4, 5);
        ts.AddEdge(5, 7);
        ts.AddEdge(6, 3);
        ts.AddEdge(6, 7);
        ts.TopologicalSort();// 1 6 2 0 4 3 5 7
    }
}