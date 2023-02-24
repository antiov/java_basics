package streams;

import entities.Employee;

import java.util.*;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        // Joining
        String empNames = Util.fourEmployees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println("empNames:"+empNames);

        // Summary Statistics
        DoubleSummaryStatistics stats = Util.fourEmployees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("status:"+stats);

        stats = Util.fourEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();
        System.out.println("status:"+stats);

        // Partitioning
        Map<Boolean, List<Employee>> moreThan30_000 = Util.fourEmployees.stream().collect(
                Collectors.partitioningBy(p -> p.getSalary()>30_000));

        System.out.println("moreThan30_000(true):"+ moreThan30_000.get(true));
        System.out.println("moreThan30_000(false):"+ moreThan30_000.get(false));

        //Grouping By
        Map<Character, List<Employee>> groupByAlphabet = Util.twentyEmployees.stream().collect(
                Collectors.groupingBy(e -> e.getLastName().charAt(0)));

        System.out.println("** groupByAlphabet **");
        groupByAlphabet.keySet().stream().forEach(key -> System.out.println("["+key+"]:"+groupByAlphabet.get(key)));

        // Mapping
        Map<Character, List<Integer>> idGroupedByAlphabet = Util.twentyEmployees.stream().collect(
                Collectors.groupingBy(e -> e.getLastName().charAt(0),
                        Collectors.mapping(Employee::getId, Collectors.toList())));

        System.out.println("** idGroupedByAlphabet **");
        idGroupedByAlphabet.keySet().stream().forEach(key -> System.out.println("["+key+"]:"+idGroupedByAlphabet.get(key)));

        // Reducing
        Comparator<Employee> byNameLength = Comparator.comparing(Employee::getName);
        Map<Character, Optional<Employee>> longestNameByAlphabet = Util.twentyEmployees.stream().collect(
                Collectors.groupingBy(e -> e.getLastName().charAt(0),
                        Collectors.reducing(BinaryOperator.maxBy(byNameLength))));

        System.out.println("** longestNameByAlphabet **");
        longestNameByAlphabet.keySet().stream().forEach(key -> System.out.println("["+key+"]:"+longestNameByAlphabet.get(key)));

    }
}
