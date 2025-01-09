import java.util.*;

public class Graph_Client2 {
    public static void main(String[] args) {
        Graph2 gf = new Graph2(4);
        gf.addEdge(1, 2, 1);
        gf.addEdge(1, 3, 4);
        gf.addEdge(2, 3, 2);
        gf.addEdge(2, 4, 3);
        gf.addEdge(3, 4, 1);
        // gf.display();
        // System.out.println(gf.hasPath(1, 6, new HashSet<>()));
        // gf.printAllPath(1, 2, new HashSet<>(), "");
        System.out.println(gf.bfs(1, 6));
    }
}
