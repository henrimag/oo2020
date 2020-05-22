import java.util.HashMap;
import java.util.Map;


/**
 * kolmasHashMap
 */
public class kolmasHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        testMap(hashMap);
    }
    public static void testMap(Map<Integer, String> map) {
        map.put(1, " abc");
        map.put(2, " def");
        map.put(3, " ghi");
        map.put(4, " jkl");
        map.put(6, " pqr");
        map.put(5, " mno");
        map.put(7, " stu");

        for(Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key +":" + value );
        }
    }
}