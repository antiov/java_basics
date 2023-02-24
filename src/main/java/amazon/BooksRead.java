package amazon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BooksRead {
    public static void main(String[] args){
        List<Integer> pages = Arrays.asList(2,4,3);//x=3
        int days = 4;
        List<Integer> pages_aux = pages.stream().sorted().collect(Collectors.toList());
        int days_aux = 0;
        for(Integer p_test: pages_aux){
            System.out.println("*** p_test:"+p_test);
            for(int i = 0;i<pages.size();i++) {
                System.out.println("chapter:"+pages.get(i));
                int days_needed = (p_test>pages.get(i))?1:(int)Math.ceil(pages.get(i) / (double)p_test);
                System.out.println("days_needed:" + days_needed);
                days_aux += days_needed;
                if (days_aux >= days) {
                    if(i==(pages.size()-1) && days_aux == days){
                        System.out.println("----->>> days_aux:"+days_aux);
                        return;
                    }
                    days_aux = 0;
                    continue;
                }
            }
        }
    }
}
