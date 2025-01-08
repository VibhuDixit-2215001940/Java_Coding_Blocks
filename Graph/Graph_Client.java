// import java.util.*;
public class Graph_Client {
    public static void main(String[] args) {
        Graph gf = new Graph(4);
        gf.addEdge(1, 2, 1);
        gf.addEdge(1, 3, 4);
        gf.addEdge(2, 3, 2);
        gf.addEdge(2, 4, 3);
        gf.addEdge(3, 4, 1);
        gf.display();
        gf.removeVertex(1);
        gf.display();
    }
}
