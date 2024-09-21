import java.util.Arrays;

public class PrintingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[][] = {{1,2},{3,4}};
        //1. USING FOR LOOP
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }//1 2 3 4 5

        //2. USING FOR EACH LOOP
        for(int i:arr){
            System.out.print(i+" ");
        }//1 2 3 4 5

        //3. USING ARRAYS TO STRING METHOD
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 5]

        //4. USING DEEP STRING METHOD
        //The deepToString() method of Java Arrays class is designed for converting multidimensional arrays to strings.
        System.out.println(Arrays.deepToString(arr1)); //[[1, 2], [3, 4]]

        //5. USING ARRAY.ASLIST METHOD
        //Arrays.asList() method is used to print array of string.
        String[] stringArray={"Hello","Java","Programmers"}; 
        System.out.println(Arrays.asList(stringArray));  //[Hello, Java, Programmers]

        //6. USING ARRAYS.STREAM().FOREACH LOOP
        Arrays.stream(stringArray).forEach(System.out::print); //HelloJavaProgrammers
    }
}
