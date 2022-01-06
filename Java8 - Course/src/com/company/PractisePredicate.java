package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PractisePredicate {

    public static void main(String[] args) {

        //Find the given long value is in between 100 and 200 or not

        // Single value between 100 and 200 without predicate chaining
        Predicate<Integer> numberBtn100And200= p -> p>100 && p<200;
        System.out.println(numberBtn100And200.test(149));

        System.out.println("-----------------------------------------------");

        // list of integers value between 100 and 200

        List<Integer> numbers= Arrays.asList(100,107,150,200,180,165,146);

        Predicate<Integer> greaterthan100 = i -> i > 100;
        Predicate<Integer> lessthan200 = i -> i < 200;

        List<Integer> integerBtn100And200 = numbers.stream()
                .filter(greaterthan100.and(lessthan200))
                .collect(Collectors.toList());
        System.out.println(integerBtn100And200 );

        System.out.println("-----------------------------------------------");

        //Find the given String contains first character 'A' or not.


        // Single String contains first character 'A' or not.

        Predicate<String> firstCharacterA= i-> i.startsWith("A");
        System.out.println(firstCharacterA.test("Australia"));

        System.out.println("-----------------------------------------------");

        // List of Strings contains first character 'A' or not.

        List<String> countries = Arrays.asList(
                "America",
                "Austria",
                "Canada",
                "Japan",
                "Afaganisthan",
                "India"
        );

        Predicate<String> stringsFirstCharacterA = c -> c.startsWith("A");

        countries.stream()
                .filter(stringsFirstCharacterA)
                .forEach(System.out::println);
    }
}
