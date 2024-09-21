import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        // ArrayList<Integer> l = new ArrayList<>();//default size is 10
        // //If exceeded than half means 5 is added and a new array is formed!!
        // //❤️❤️
        // ArrayList<Integer> l1 = new ArrayList<>(20);//size is changed to 20
        // //If exceeded than a new array is formed with size n*(1.5) i.e. 30

        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(20);
        l2.add(200);
        l2.ensureCapacity(100);
        for(int i:l2){
            System.out.println(i);
        }
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i));
        }
        System.out.println(l2);
    }
}
