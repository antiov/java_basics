import entities.Person;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Reflections {
    public static void main(String args[]){
        //Testing IntStreams
        IntStream.range(1,5).forEach(System.out::println);

        ArrayList<String> methodNames = new ArrayList();
        Method[] methods = Person.class.getDeclaredMethods();
        for (Method m:methods) {
            methodNames.add(m.getName());
        }

        /* Sort and print names */
        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}