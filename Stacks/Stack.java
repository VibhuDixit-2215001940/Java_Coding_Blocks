public class Stack {
    private int[] arr;
    private int idx;
    public Stack(){
        arr = new int[5];
    }
    public Stack(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return idx==0;
    }
    public void push(int item) throws Exception{
        if(isfull()) throw new Exception("Stack is full");
        arr[idx++] = item;
    }
    public boolean isfull(){
        return idx==arr.length;
    }
    public int capacity(){
        return arr.length;
    }
    public int size(){
        return idx;
    }
    public int peek(){
        return arr[idx-1];
    }
    public int pop() throws Exception{
        if(isEmpty()) throw new Exception("Stack is Empty");
        return arr[--idx];
    }
    public void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // public void clear(){
    //     for(int i=0;i<idx;i++){

    //     }
    // }
}
