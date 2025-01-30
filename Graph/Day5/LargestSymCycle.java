import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LargestSymCycle {
    public static int largestCycleSum(int[] edges, int n) {
        int[] in = new int[n];
        for (int i = 0; i < in.length; i++) {
            if (edges[i] != -1) {
                in[edges[i]]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int rv = q.poll();
            visited[rv] = true;
            if (edges[rv] != -1) {
                in[edges[rv]]--;
                if (in[edges[rv]] == 0) {
                    q.add(edges[rv]);
                }
            }
        }
        int maxSum = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int sum = i;
                visited[i] = true;
                int nbrs = edges[i];
                while (nbrs != i) {
                    sum += nbrs;
                    visited[nbrs] = true;
                    nbrs = edges[nbrs];
                    // if(nbrs == -1) break;
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int res = largestCycleSum(a, n);
            System.out.println(res);
        }
    }
}

// import java.util.*;

// public class Main {
// public static int largestCycleSum(int[] a) {
// int n = a.length;
// int maxSum = -1;
// boolean[] visited = new boolean[n];

// for (int i = 0; i < n; i++) {
// if (!visited[i]) {
// List<Integer> tempList = new ArrayList<>();
// int j = i, sum = 0;

// while (j < n && a[j] != -1 && !visited[j] && !tempList.contains(j)) {
// tempList.add(j);
// sum += j;
// j = a[j];

// if (j < n && j == i) {
// sum += j;
// maxSum = Math.max(maxSum, sum);
// break;
// }
// }

// for (int index : tempList) {
// visited[index] = true;
// }
// }
// }

// return maxSum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt(); // Number of test cases

// while (t-- > 0) {
// int n = sc.nextInt();
// int[] a = new int[n];

// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }

// int res = largestCycleSum(a);
// System.out.println(res);
// }

// sc.close();
// }
// }

// class Solution {
// public int longestCycle(int[] edges) {
// int n = edges.length;
// boolean[] visit = new boolean[n];
// int[] indegree = new int[n];

// // Count indegree of each node.
// for (int edge : edges) {
// if (edge != -1) {
// indegree[edge]++;
// }
// }

// // Kahn's algorithm starts.
// //Adding all the nodes to queue which have indegree == 0
// Queue<Integer> q = new LinkedList<>();
// for (int i = 0; i < n; i++) {
// if (indegree[i] == 0) {
// q.offer(i);
// }
// }

// //Only those element come to queue and will be marked visited whoes indegree
// becomes zero
// while (!q.isEmpty()) {
// int node = q.poll();
// visit[node] = true;
// int neighbor = edges[node];
// if (neighbor != -1) {
// indegree[neighbor]--;
// if (indegree[neighbor] == 0) {
// q.offer(neighbor);
// }
// }
// }
// // Kahn's algorithm ends.

// int answer = -1;
// for (int i = 0; i < n; i++) {
// if (!visit[i]) {
// int neighbor = edges[i];
// int count = 1;
// visit[i] = true;
// // Iterate in the cycle.
// while (neighbor != i) {
// visit[neighbor] = true;
// count++;
// neighbor = edges[neighbor];
// }
// answer = Math.max(answer, count);
// }
// }
// return answer;
// }
// }