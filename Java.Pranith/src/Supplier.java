public class Supplier {

    public static void main(String args[]) {

        int n = 20;
        Supplier<Integer> integerSupplier = () -> {
            System.out.print("Odd Numbers from 1 to 20 are: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            return null;
        };
        integerSupplier.get();
            }
        }


