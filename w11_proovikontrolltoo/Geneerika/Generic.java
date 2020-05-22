import java.util.ArrayList;
import java.util.HashMap;

/**
 * App
 */
public class Generic {

    public static void main(String[] args) {

        // List ilma geneerikata
        ArrayList list = new ArrayList ();

        list.add("õun");
        list.add("pirn");
        list.add("banaan");
        list.add("apelsin");
        list.add("mango");

        String fruit = (String) list.get(1);
        System.out.println(fruit);
        
        // List geneerikaga
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("koer");
        strings.add("hamster");
        strings.add("kass");
        strings.add("lammas");

        String animal = strings.get(1);
        System.out.println(animal);
        
        //HashMap<Integer, String> map = new HashMap<Integer, String>();

        //ArrayList<Integer> someList = new ArrayList<>();
    }
}