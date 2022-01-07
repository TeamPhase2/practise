package practice;

import java.util.Scanner;
import java.util.function.Function;

class DayTest
{
    public static void main(String args[]){
     String weeks[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String day= sc.nextLine();
        Function<String,String >dayCheck=d->{
            if(d.equals("Sunday")){
                return "Monday";
            }
            for(int i=0;i<d.length();i++){

                if (weeks[i].equals(d)) {
                    i++;
                    String anotherValue = weeks[i];
                    return anotherValue;                }

            }
            return null;

        };
        System.out.println( " Next day is"+dayCheck.apply(day));

    }
}