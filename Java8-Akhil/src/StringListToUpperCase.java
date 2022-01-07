import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListToUpperCase {


    public static void main(String[] args) {
        List<String> teams = Arrays.asList("sunrisers", "royalchallengers", "dehicapitals", "rajasthanroyals");
        teams.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}
