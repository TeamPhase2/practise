package Java.FuctionalInterfaces;

import java.util.function.Supplier;

public class UsingSupplierExample {
	
	public static void main(String[] args) {
		
		final Integer[] i = new Integer[1];
        final Integer[] j = new Integer[1];
        final Integer[] count = {0};
        Supplier<Integer> integerSupplier = () -> {
            for (i[0] = 2; i[0] <= 20; i[0]++) {
                for (j[0] = 1; j[0] <= i[0]; j[0]++) {
                    if (i[0] % j[0] == 0)
                        count[0]++;
                }
                if (count[0] == 2)
                    System.out.print(" " + i[0]);
                count[0] = 0;
            }
            return null;
        };
        integerSupplier.get();
    }

}	 	

   


