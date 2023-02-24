package streams;

import entities.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        namesFlatStream.forEach(System.out::println);

        List<Person> three_mployees1 = IntStream.rangeClosed(1,3)
                .mapToObj(Person::new).collect(Collectors.toList());
        List<Person> three_mployees2 = IntStream.rangeClosed(1,3)
                .mapToObj(Person::new).collect(Collectors.toList());
        List<Person> three_mployees3 = IntStream.rangeClosed(1,3)
                .mapToObj(Person::new).collect(Collectors.toList());
        List<List<Person>> people = Arrays.asList(
                three_mployees1,
                three_mployees2,
                three_mployees3
        );

        List<Person> p_out = people.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        p_out.forEach(System.out::println);

    }
}
