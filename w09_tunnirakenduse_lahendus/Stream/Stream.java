import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    
    public static void main(String[] args) {
        
        List<Integer> integerList = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*
        for (Integer i : integerList) {
            System.out.println(i);
        */
    
        //Lambda expression () -> ...
        //integerList.forEach((i) -> System.out.println(i));
        
        //integerList.forEach(System.out::println);

        List<Integer> integerList2 = integerList.stream().filter(element -> element < 5).collect(Collectors.toList());
        
        integerList2.forEach(System.out::println);

        List<Integer> integerList3 = integerList.stream()
                                .map(element -> element * 2)
                                .peek(System.out::println)
                                .map(element -> element * 2)
                                .peek(System.out::println)
                                .collect(Collectors.toList());

        integerList3.forEach(System.out::println);

        }
    }
