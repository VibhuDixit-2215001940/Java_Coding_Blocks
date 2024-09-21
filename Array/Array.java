// Garbage value is a random combination of 32bit integer type no.
//JVM runs java programs
//Array is a non primitive type data
//All non primitive data type is stored in HEAP and for primitive STACK
public class Array{
    public static void main(String[] args) {
        int x = 0;
        int[] arr = null;
        System.out.println(arr);//null
        //here JVM runs only new int[5] part and reserves 5 array memory
        int[] brr = new int[5];
        System.out.println(brr);//[I@4617c264
        //🙃Here [    denotes 1D arry
        //I denotes integer type and rest is datatype
        // System.out.println(arr.length);//error
        System.out.println(brr.length);//5
    }
}
//WHY ZERO BASE INDEXING??
///Becuase in computer laguage a calculation is always doing arr[n] = baseaddress + index * datasize
//2k + 3 * 4(for int) = 2012