// import java.util.*;

// public class NearestMeetingCell {

//     public static int minimumWeight(int n, int[] edges, int C1, int C2) {
//         // Create directed graph from the array given in input
//         List<List<Integer>> graph = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             graph.add(new ArrayList<Integer>());
//         }
//         for (int i = 0; i < n; i++) {
//             if (edges[i] != -1) {
//                 graph.get(i).add(edges[i]);
//             }
//         }
//         // Create two arrays A and B for storing min distance from C1 and C2
//         long[] A = new long[n];
//         long[] B = new long[n];
//         Arrays.fill(A, Long.MAX_VALUE);
//         Arrays.fill(B, Long.MAX_VALUE);
//         // Part 1 and Part 2 of Algo -> Implement a dijkstra function and call it for
//         // both arrays A and B
//         dijkstra(C1, graph, A);
//         dijkstra(C2, graph, B);
//         // Now comes Part 3 part of algo-> loop through and get node with min(A[i]+B[i])
//         int node = 0;
//         long dist = Long.MAX_VALUE;
//         for (int i = 0; i < n; i++) {
//             // if node is not accessible from any of them ignore it
//             if (A[i] == Long.MAX_VALUE || B[i] == Long.MAX_VALUE)
//                 continue;
//             if (dist > A[i] + B[i]) {
//                 dist = A[i] + B[i];
//                 node = i;
//             }
//         }
//         if (dist == Long.MAX_VALUE)
//             return -1; // if no meeting point is found
//         return node;
//     }

//     private static void dijkstra(int start, List<List<Integer>> graph, long[] dis) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         pq.offer(start);
//         dis[start] = 0;
//         while (!pq.isEmpty()) {
//             int curr = pq.poll();
//             for (int nbrs : graph.get(curr)) {
//                 long d = dis[curr] + 1; // all edges have same weight 1
//                 if (d < dis[nbrs]) {
//                     dis[nbrs] = d;
//                     pq.offer(nbrs);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] edges = new int[n];
//         for (int i = 0; i < n; i++) {
//             edges[i] = sc.nextInt();
//         }
//         int C1 = sc.nextInt();
//         int C2 = sc.nextInt();
//         System.out.println(minimumWeight(n, edges, C1, C2));
//     }

// }

// import java.util.*;

// public class NearestMeetingCell {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] edges = new int[n];
//         for (int i = 0; i < n; i++) {
//             edges[i] = sc.nextInt();
//         }
//         int C1 = sc.nextInt();
//         int C2 = sc.nextInt();
//         System.out.println(minimumWeight(n, edges, C1, C2));
//     }

//     public static int minimumWeight(int n, int[] edges, int c1, int c2) {
//         long[] A = new long[n];
//         long[] B = new long[n];
//         Arrays.fill(A, Long.MAX_VALUE);
//         Arrays.fill(B, Long.MAX_VALUE);
//         int dis = 1;
//         Queue<Integer> q = new LinkedList<>();
//         q.add(c1);
//         while (!q.isEmpty()) {
//             int r = q.poll();
//             if (A[r] > dis) {
//                 A[r] = dis;
//             }
//             int nbrs = edges[r];
//             q.add(nbrs);
//             dis++;
//         }
//         return -1;
//     }
// }
import java.util.*;

public class NearestMeetingCell {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21 };
        int n = 23, c1 = 9, c2 = 2;

        Map<Integer, List<Integer>> G = new HashMap<>();
        for (int u = 0; u < arr.length; u++) {
            if (arr[u] == -1)
                continue;
            G.putIfAbsent(u, new ArrayList<>());
            G.get(u).add(arr[u]);
        }

        System.out.println(bfs(G, n, c1, c2));
    }

    public static int bfs(Map<Integer, List<Integer>> G, int n, int c1, int c2) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { c1, 1 });
        q.add(new int[] { c2, 2 });
        int[] vis = new int[n];

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0], num = cur[1];

            if ((vis[node] == 2 && num == 1) || (vis[node] == 1 && num == 2)) {
                return node; // The first common node found
            }
            if (vis[node] == num)
                continue; // Skip cycles

            vis[node] = num;
            if (G.containsKey(node)) {
                for (int nei : G.get(node)) {
                    q.add(new int[] { nei, num });
                }
            }
        }
        return -1;
    }
}
