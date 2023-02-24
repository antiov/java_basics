package streams;

import entities.Employee;
import org.apache.commons.lang3.time.StopWatch;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parallel {
    public static void main(String[] args) {
        List<Employee> employees1 = IntStream.rangeClosed(1,100)
                .mapToObj(Employee::new).collect(Collectors.toList());
        List<Employee> employees2 = IntStream.rangeClosed(1,400)
                .mapToObj(Employee::new).collect(Collectors.toList());

        // Simple stream
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        employees1.forEach(e->e.setSalary(e.getSalary()*1.1));
        stopWatch.stop();
        System.out.println("SimpleTime1:"+stopWatch.getTime());

        // Parallel stream
        stopWatch = new StopWatch();
        stopWatch.start();
        employees1.stream().parallel().forEach(e->e.setSalary(e.getSalary()*1.1));
        stopWatch.stop();
        System.out.println("ParallelTime1:"+stopWatch.getTime());

        // Simple stream
        stopWatch = new StopWatch();
        stopWatch.start();
        employees2.forEach(e->e.setSalary(e.getSalary()*1.1));
        stopWatch.stop();
        System.out.println("SimpleTime2:"+stopWatch.getTime());

        // Parallel stream
        stopWatch = new StopWatch();
        stopWatch.start();
        employees2.stream().parallel().forEach(e->e.setSalary(e.getSalary()*1.1));
        stopWatch.stop();
        System.out.println("ParallelTime2:"+stopWatch.getTime());
    }
}
