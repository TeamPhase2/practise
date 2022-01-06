package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PractisePredicate {

    public static void main(String[] args) {

        //Find the given long value is in between 100 and 200 or not

        List<Integer> numbers= Arrays.asList(100,107,150,200,180,165,146);

        Predicate<Integer> predicate1 = i -> i > 100;
        Predicate<Integer> predicate2 = i -> i < 200;

        java.util.function.Predicate<Integer> andPredicate = predicate1.and(predicate2);

        List<Integer> collect = numbers.stream()
                .filter(andPredicate)
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("-----------------------------------------------");

        //Find the given String contains first character 'A' or not.

        String country= "Australia";
        boolean stringPredicate = country.startsWith("A");
        System.out.println(stringPredicate);

        List<String> countries = Arrays.asList(
                "America",
                "Austria",
                "Canada",
                "Japan",
                "Afaganisthan",
                "India"
        );

        Predicate<String> p = c -> c.startsWith("A");

        countries.stream()
                .filter(p)
                .forEach(System.out::println);


    }
}
