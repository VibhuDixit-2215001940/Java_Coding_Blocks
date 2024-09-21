import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class IterateOverCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        for (int i = 0; i < str.length(); i++) { 
            System.out.print(str.charAt(i)); 
            System.out.print(" "); //H e l l o   w o r l d 
        } 

        CharacterIterator itr = new StringCharacterIterator(str); 
        while (itr.current() != CharacterIterator.DONE) { 
            System.out.print(itr.current()); 
            System.out.print(" "); //H e l l o   w o r l d 
            itr.next(); 
        } 
    }
}
