import java.util.*;
import java.util.stream.*;

public class File1 {
    public static void main(String[] args) {
        // 1. Integer stream
        IntStream.range(1,10)
                 .forEach(System.out::println);
        System.out.println();
                 
        IntStream.range(1,10)
                 .skip(5)       
                 .forEach(System.out::println);
        System.out.println();
                 
        int sum14 = IntStream.range(1,5)
                 .sum();
        System.out.println(sum14);
        
        // 2. Stream.of
        Stream.of("Ave", "John", "Becca")
              .sorted()
              .findFirst()
              .ifPresent(System.out::println);
        System.out.println();
              
        String[] names = { "Jason", "Carly", "John", "David", "Alex", "Zayne" };
        Stream.of(names)
              .filter(name -> !name.startsWith("J"))
              .sorted()
              .forEach(System.out::println);
        System.out.println(); 
        
        double total = Stream.of(1.3, 1.2, 1.1)
                             .reduce(0.0, (Double a, Double b) -> a+b);
        System.out.println(total);
        System.out.println();                           
              
        // 3. stream from array
        Arrays.stream(new int[] {1, 2, 3, 4, 5})
              .map(x -> x*x)
              .average()
              .ifPresent(System.out::println);
        System.out.println();
                 
        // 4. stream from list
        List<String> people = Arrays.asList("Jason", "Carly", "John", "David", "Alex", "Zayne");
        people.stream()
              .map(String::toLowerCase)
              .filter(x -> !x.startsWith("j"))
              .forEach(System.out::println);
        System.out.println();
                 
        List<String> filterPeople = people.stream()
                                          .map(String::toLowerCase)
                                          .filter(x -> !x.startsWith("j"))
                                          .collect(Collectors.toList());
        filterPeople.forEach(System.out::println);
        System.out.println();
              
    }
}
