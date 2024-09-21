//Java String Program to Print even length words
import java.util.Scanner;

public class PrintEvenLengthWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(String word : str.split(" ")){
            if (word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}
// Input: s = "This is a java language"
// Output: This
//         is
//         java
//         language 

// Input: s = "i am GFG"
// Output: am