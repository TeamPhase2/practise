import java.util.*;

public class SampleCollection {
    public static void main(String[] args) {
        //Array
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "mango";
        fruits[2] = "strawberry";
        try {
            System.out.println(fruits[3]);
        } catch (Exception e) {
            System.out.println("an exception occured");
        }
        //Arraylist
        ArrayList fruitList = new ArrayList();
        fruitList.add("orange");
        fruitList.add("Apple");
        fruitList.add("mango");
        // System.out.println(fruitList);
        Collection values = new ArrayList();
        values.add(3);
        values.add("Akhil");
        values.add(9.9);

        //  Iterator i = values.iterator();
        // System.out.println(i.next());
        //  System.out.println(i.next());
        //   System.out.println(i.next());
        //   while(i.hasNext()){
        //       System.out.println(i.next());
        //   }
        for (Object i : values) {
            System.out.println(i);
        }
        Collection<Integer> values1 = new ArrayList<Integer>();
        values1.add(22);
        values1.add(28);
        values1.add(29);
        for (Object j : values1) {
            System.out.println(j);
        }
        List<Integer> values2 = new ArrayList<Integer>();
        values2.add(27);
        values2.add(8);
        values2.add(9);
        Collections.sort(values2);
        // for(Object k : values2){
        //   System.out.println(k);

        values2.forEach(System.out::println);
    }


}

