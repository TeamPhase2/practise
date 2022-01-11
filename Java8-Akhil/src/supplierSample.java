import java.util.function.Supplier;

public class supplierSample {

    public static void main(String[] args) {


        int n = 20;
        Supplier<Integer> integerSupplier = () -> {
            int i;
            for (i = 1; i < n; i++) {

                if (i % 2 == 0) {
                    System.out.print(" " + i);

                }
            }
            return null;
        };
        integerSupplier.get();
    }
}