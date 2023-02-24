package streams;

import entities.Employee;
import entities.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Util {
    public static List<Person> thirtyPeople = IntStream.rangeClosed(1,30)
            .mapToObj(Person::new).collect(Collectors.toList());
    public static List<Employee> fourEmployees = IntStream.rangeClosed(1,4)
            .mapToObj(Employee::new).collect(Collectors.toList());

    public static List<Employee> twentyEmployees = IntStream.rangeClosed(1,20)
            .mapToObj(Employee::new).collect(Collectors.toList());
}
