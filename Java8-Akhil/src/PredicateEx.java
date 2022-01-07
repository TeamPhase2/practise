import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateEx {


    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> (number % 2) == 0;


        System.out.println(isEven.test(8));
        System.out.println(isEven.test(11));

        List<Integer> integerlist = Arrays.asList(10, 20, 30, 40);
        Predicate<Integer> predicateList = i -> integerlist.contains(i);
        System.out.println(predicateList.test(11));

    }
}



