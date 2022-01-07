import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLisToUpperCase {

    public static void main(String[] args) {

        StringLisToUpperCase obj = new StringLisToUpperCase();

        List<String> list = Arrays.asList("node", "c-plus-plus", "java", "javascript");


        list.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

    }

    public <T, R> List<R> map(List<T> list, Function<T, R> func) {

        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(func.apply(t));
        }
        return result;

    }


}



