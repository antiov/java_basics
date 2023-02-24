package streams;

import entities.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Person> people = Util.thirtyPeople.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        people.forEach(System.out::println);

        System.out.println("*********");
        //Set<Person> set = Set.of(Util.thirtyEmployees.toArray(Person[]::new));
        Set<Person> set = new HashSet<>(Util.thirtyPeople);
        set.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
