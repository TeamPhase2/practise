
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class StringListToUpperCase {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Sydney", "New York", "London");

        Function<List<String>, List<String>> convertToUpperCase = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }


            return list;
        };


    }

}



















