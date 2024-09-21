import java.util.ArrayList;
import java.util.Scanner;

public class TakingInputInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Enter elements for the ArrayList (type 'exit' to stop):");
        while (true){
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("exit") || userInput.equalsIgnoreCase("stop") ){// Check if the user wants to exit
                break;
            }
            str.add(userInput);// Add the user input to the ArrayList
        }
        sc.close();
        System.out.println("Elements entered by the user: " + str);
    }
}
