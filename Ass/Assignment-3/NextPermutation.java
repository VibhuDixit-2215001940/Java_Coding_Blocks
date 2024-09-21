import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    int n;

    while (t-- > 0) {
        n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        array = dubachi(array);
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        
        System.out.println();
    }

    scanner.close();
}

static int[] dubachi(int[] array) {
    int n = array.length;
    int index = n - 2;
    
    while (index >= 0 && array[index] >= array[index + 1]) {
        index--;
    }

    if (index >= 0) {
        int j = n - 1;
        while (array[j] <= array[index]) {
            j--;
        }
        swap(array, index, j);
    }
    
    reverse(array, index + 1, n - 1);
    
    return array;
}

static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

static void reverse(int[] array, int start, int end) {
    while (start < end) {
        swap(array, start, end);
        start++;
        end--;
    }
}

}
