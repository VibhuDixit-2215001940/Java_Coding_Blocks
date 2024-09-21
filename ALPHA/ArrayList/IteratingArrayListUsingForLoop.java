import java.util.ArrayList;
public class IteratingArrayListUsingForLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // Volvo
        // BMW
        // Ford
        // Mazda
        //You can also loop through an ArrayList with the for-each loop:
        for (String i : cars) {
            System.out.println(i);
        }
        // Volvo
        // BMW
        // Ford
        // Mazda
    }
}
