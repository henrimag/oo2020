import java.util.ArrayList;

/**
 * kolmasArrayList
 */
public class kolmasArrayList {

    public static void main(String[] args) {
        ArrayList <Integer> numbers= new ArrayList<Integer>();

        //Lisamine
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        //Välja kutsumine
        System.out.println(numbers.get(0));

        System.out.println("Iteration #1: ");
        for (int i=0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nIteration #2: ");
        for(Integer value: numbers) {
            System.out.println(value);
        }
        //Remove items
        numbers.remove(numbers.size() -1);
        //Aeglane listi alguses
        numbers.remove(0);
         
    }
}