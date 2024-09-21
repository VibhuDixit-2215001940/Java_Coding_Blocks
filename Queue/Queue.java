public class Queue {
    private int[] arr;
    private int front;
    private int size;
    public Queue(){
        arr = new int[5];
    }
    public Queue(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public int size(){
        return size;
    }
    public int capacity(){
        return arr.length;
    }
    // public void Enqueue(int item){
        // if(isFull()){
        //     throw new Exception("Queue is full");
        // }
    //     arr[size++]=item;
    // }
    public void Enqueue(int item)throws Exception{          //CIRCULAR PURPOSE
        if(isFull()){
            throw new Exception("Queue is full");
        }
        int idx = (front+size)%arr.length;
        arr[idx++]=item;
        size++;
    }
    // public int Dequeue(){            
    //     int v = arr[front++];
    //     size--;
    //     return v;
    // }
    public int Dequeue(){       //CIRCULAR PURPOSE
        int v = arr[front];
        front = (front+1)%arr.length;
        size--;
        return v;
    }
    public void Display(){
        for(int i=0;i<size;i++){
            int idx = (front+size)%arr.length;
            System.out.println(arr[idx]+" ");
        }
        System.out.println();
    }
}
