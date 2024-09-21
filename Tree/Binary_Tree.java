import java.util.*;

public class Binary_Tree {
  Scanner sc = new Scanner(System.in);

  class Node {
    int val;
    Node left;
    Node right;
  }

  private Node root;

  public Binary_Tree() {
    root = CreateTree();
  }

  private Node CreateTree() {
    int item = sc.nextInt();
    Node nn = new Node();
    nn.val = item;
    boolean hlc = sc.nextBoolean();
    if (hlc) {
      nn.left = CreateTree();
    }
    boolean hrc = sc.nextBoolean();
    if (hrc) {
      nn.right = CreateTree();
    }
    return nn;
  }
  public void Display1(Node node) {
    if (node == null) {
      return;
    }
    System.out.println(node.val);
    Display1(node.left);
    Display1(node.right);
  }
  public void Display() {
    Display2(root);
  }
  private void Display2(Node node) {
    if (node == null) {
      return;
    }
    String s = "";
    s = "<--" + node.val + "-->";
    if (node.left != null)
      s = node.left.val + " " + s;
    else
      s = "@" + " " + s;
    if (node.right != null)
      s = s + " " + node.right.val;
    else
      s = s + " " + "@";
    System.out.println(s);
    Display2(node.left);
    Display2(node.right);
  }
  public int max(){
    return max(root);
  }
  private int max(Node nn){
    if(nn == null) return Integer.MAX_VALUE;
    int left = max(nn.left);
    int right = max(nn.right);
    return Math.max(left, Math.max(right, nn.val));
  }
  public boolean find(int item){
    return find(root,item);
  }
  private boolean find(Node node,int item){
    if(node == null) return false;
    if(node.val == item) return true;
    return find(node.left, item) || find(node.right, item);
  }
  public int height(){
    return height(root);
  }
  private int height(Node node){
    if(node == null) return -1;
    return 1 + Math.max(height(node.left), height(node.right));
  }
  public void PreOrder(){
    PreOrder(root);
    System.out.println();
  }
  private void PreOrder(Node node){
    if(node == null) return;
    System.out.print(node.val + " ");
    PreOrder(node.left);
    PreOrder(node.right);
  }
  public void PostOrder(){
    PostOrder(root);
    System.out.println();
  }
  private void PostOrder(Node node){
    if(node == null) return;
    PostOrder(node.left);
    PostOrder(node.right);
    System.out.print(node.val + " ");
  }
  public void InOrder(){
    InOrder(root);
    System.out.println();
  }
  private void InOrder(Node node){
    if(node == null) return;
    InOrder(node.left);
    System.out.print(node.val + " ");
    InOrder(node.right);
  }
  public void levelOrder(){
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      Node nn = q.poll();
      System.out.print(nn.val + " ");
      if(nn.left!= null) q.add(nn.left);
      if(nn.right!= null) q.add(nn.right);
    }
    System.out.println();
  }
}