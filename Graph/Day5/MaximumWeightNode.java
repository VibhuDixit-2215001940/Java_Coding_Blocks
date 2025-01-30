// https://leetcode.com/discuss/interview-question/2032859/juspay-oa-maximum-weight-node

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// public class Maximum_weight {
//     public static int bfs(int n, ArrayList<ArrayList> adj, int[] weights) {
//         int[] temp = new int[n];
//         Queue q = new LinkedList<>();
//         int Max = Integer.MIN_VALUE;
//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             if (weights[i] >= Max) {
//                 ans = i;
//                 Max = weights[i];
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int[] arr = new int[n];
//         ArrayList<ArrayList> adj = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             adj.add(new ArrayList());
//             arr[i] = scan.nextInt();
//         }
//         int[] weights = new int[n];

//         for (int i = 0; i < n; i++)
//             if (arr[i] != -1) {
//                 adj.get(i).add(arr[i]);
//                 weights[arr[i]] += i;
//             }
//         int weight = bfs(n, adj, weights);
//         System.out.println(weight);
//     }
// }

import java.util.*;

public class MaximumWeightNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1)
                brr[arr[i]] += i;
        }
        int max = 0, idx = -1;
        for (int i = n - 1; i > 0; i--) {
            if (max < brr[i]) {
                max = brr[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }
}