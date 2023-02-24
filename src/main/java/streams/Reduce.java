package streams;

import entities.Employee;

import java.util.stream.Collectors;

public class Reduce {
    public static void main(String[] args) {
        // Reduce
        Double sumSal = Util.fourEmployees.stream()
                .peek(System.out::println)
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("sumSal:"+sumSal);
    }
}
