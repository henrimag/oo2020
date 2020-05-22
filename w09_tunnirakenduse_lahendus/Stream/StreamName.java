import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamName {

    public static void main(String[] args) {

        List<String> loomad = Arrays.asList("flamingo","jääkaru","konn","siil","rebane", "vares");

        List<String> loomanimed = loomad.stream()  
                .filter(str -> str.length() > 4 && str.length() < 8)
                .collect(Collectors.toList());  

        loomanimed.forEach(System.out::println);           

    }

}