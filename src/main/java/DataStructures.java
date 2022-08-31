import entities.Person;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DataStructures {
    public static void main(String[] args){
        String[] array = new String[]{"A","B","C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"),"C"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
        String st1 = new String("hola");
        String st2 = "hola";
        System.out.println(st1.equals(st2));
        System.out.println(st1 == st2);

        List<String> songTitles = Arrays.asList("humble","element","dna");
        Function<String,String> capitalize = str -> str.toUpperCase();
        songTitles.stream().map(capitalize).forEach(System.out::println);

        Map<String,Integer> forestSpecies = new HashMap<>();
        forestSpecies.put("A",3000);
        System.out.println("size="+forestSpecies.size());

        List<String> dates = new ArrayList<String>(Arrays.asList("fjdj/sk-","dkd/-"));
        UnaryOperator<String> replaceSlashes = date -> date.replace("/","-");
        dates.replaceAll(replaceSlashes);
        System.out.println(dates);

        List<Integer> intSquareList = Arrays.asList(2,2,4);
        Function<Integer,Integer> squareLambda = x -> x * x;
        intSquareList.stream().map(squareLambda).forEach(System.out::println);

        ArrayList<String> strs = new ArrayList<>(Arrays.asList("uno","dos"));
        for (String str: strs){
            System.out.println(str);
        }

        int a = 1;
        int b = 0;
        //int c = a/b;//Arithmetic exception
        //System.out.println("c="+c);

        List<Integer> numbers = List.of(2,3,4);
        int total = numbers.stream()
                    .filter(x -> x%2 == 0)
                    .mapToInt(x -> x*x)
                    .sum();
        System.out.println("total="+total);


    }
}
