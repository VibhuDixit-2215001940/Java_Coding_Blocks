public class Array1 {
    public static void main(String[] args) {
        //In this case only reference variable is made twice
        //In memory only one array is formed
        int[] arr = new int[5];
        int[] other = arr;
        System.out.println(other);//[I@4617c264
        System.out.println(other.length);//5
    }
}
