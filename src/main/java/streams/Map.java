package streams;

import entities.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        Integer[] empIds = { 1, 2, 3 };

        List<Person> employees = Stream.of(empIds)
                .map(Person::new)
                .collect(Collectors.toList());

        employees.forEach(System.out::println);

        List<Integer> ids = Stream.of(empIds).collect(Collectors.toList());
        ids.forEach(System.out::println);
    }
}
