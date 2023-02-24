package streams;

import entities.Person;

import java.util.List;
import java.util.stream.Collectors;

import static streams.Util.thirtyPeople;

public class Peek {
    public static void main(String[] args) {
        List<Person> list =  thirtyPeople.stream()
                .peek(p->p.setId(p.getId()+1))
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("************+");
        list.forEach(System.out::println);
        System.out.println("************+");
        thirtyPeople.forEach(System.out::println);
    }
}
