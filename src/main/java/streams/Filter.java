package streams;

import entities.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filter {

    public static void main(String[] args) {
        List<Person> employees = IntStream.rangeClosed(1,30)
                .mapToObj(Person::new)
                .filter(p -> p.getName().startsWith("C"))
                .filter(p -> p.getLastName().length()>4)
                .collect(Collectors.toList());

        employees.forEach(System.out::println);
    }
}
