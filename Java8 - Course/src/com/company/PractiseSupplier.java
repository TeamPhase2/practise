package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class PractiseSupplier {
    public static void main(String args[]){
        // Today's
        Supplier<LocalDate> todayDate = () ->LocalDate.now();
         System.out.println("Today's date : "+todayDate.get());
        Supplier<LocalDate> tomorrowDate= () -> LocalDate.now().plusDays(1);
        System.out.println("Tomorrow's Date : "+tomorrowDate.get());

    }
}
