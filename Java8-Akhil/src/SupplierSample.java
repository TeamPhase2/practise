import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierSample {

    public static void main(String[] args) {


        int n = 20;
        Supplier<Integer> integerSupplier = () -> {
            int i;
            IntStream.range(1, n).filter(x -> x % 2 == 0).forEach(System.out::println);
            return null;
        };
        integerSupplier.get();
    }
}