public class StringIntro{
    public static void main(String[] args) {
        //STRINGS ARE IMMUTABLE IN NATURE
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(arr);//abcd
        System.out.println(str);//abcd
        System.out.println(str2);//xyz
    }
}
// A String in Java is a sequence of characters that can be used to store and manipulate text data and It is basically an array of characters that are stored in a sequence of memory locations. 