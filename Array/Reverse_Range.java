public class Reverse_Range {
        public static void main(String[] args) {
            int[] arr = {0,1,2,3,4,5,6,7,8,9};
            Reverse(arr, 2, 6);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    
        public static void Reverse(int[] arr, int i, int j) {
            while (i < j) {// for(; i<j; i++,j--)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
}
