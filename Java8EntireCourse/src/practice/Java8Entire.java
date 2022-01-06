package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Entire {
    public static void main(String args[]) {

        List<Task> list = new ArrayList<>();
        list.add(new TaskBuilder().setId(1).setSummary("Java8").setDescription("Completed").setDueDate("16/12/2021").build());
        list.add(new TaskBuilder().setId(2).setSummary("Junit").setDescription("Not Completed").setDueDate("14/12/2021").build());
        list.add(new TaskBuilder().setId(3).setSummary("Spring").setDescription("progress").setDueDate("14/12/2021").build());
        list.add(new TaskBuilder().setId(4).setSummary("Cloud").setDescription("progress").setDueDate("12/12/2021").build());
        list.add(new TaskBuilder().setId(5).setSummary("Batch").setDescription("progress").setDueDate("12/12/2021").build());
        list.add(new TaskBuilder().setId(6).setSummary("C").setDescription("Completed").setDueDate("13/12/2021").build());
        list.add(new TaskBuilder().setId(7).setSummary("React").setDescription("Not Completed").setDueDate("13/12/2021").build());
        //Iteration of List
        list.stream().forEach(System.out::println);
        //Based on query Iteration
        System.out.println("------------------------------------------------");
        list.stream().filter(t -> t.getDescription().equalsIgnoreCase("progress")).map(t -> t.getSummary()).collect(Collectors.toList()).forEach(System.out::println);
        ///List to Map Conversion
        System.out.println("--------------------------------------------------------------------------------------");
        Map<Integer, Task> map = list.stream().collect(Collectors.toMap(Task::getId, Function.identity()));
        System.out.println(map);
        //FindAny and Find first
        System.out.println("--------------------------------find first------------------------------------------------------");
        Optional<Task> optionalTask = list.stream().filter(t -> t.getDueDate().equalsIgnoreCase("12/12/2021")).findFirst();
        System.out.println(optionalTask);
        System.out.println("--------------------------------find Any------------------------------------------------------");
        Optional<Task> optionalTask2 = list.stream().filter(t -> t.getDescription().equalsIgnoreCase("Not Completed")).findAny();
        System.out.println(optionalTask2);
        //Predictes usage
        System.out.println("--------------------------------Predicates or()------------------------------------------------------");
        List<Task> result = list.stream()
                .filter(((Predicate<Task>) name -> name.getDueDate().equalsIgnoreCase("12/12/2021"))
                        .or(name -> name.getDescription().equalsIgnoreCase("completed")))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
