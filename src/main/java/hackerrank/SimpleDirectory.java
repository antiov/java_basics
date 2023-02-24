package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SimpleDirectory {
    public static List<Integer> contacts(List<List<String>> queries) {
        List<String> directory = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        // Write your code here
        for(List<String> line: queries){
            //System.out.println("line:"+line);
            String query = line.get(0);
            String name = line.get(1);
            if(query.equals("add")){
                directory.add(name);
            }else{
                //System.out.println("find:"+name);
                Integer r = directory.stream().filter(n ->n.startsWith(name)).toArray().length;
                System.out.println("r:"+r);
                result.add(r.intValue());
            }
            //System.out.println("directory:"+directory);
        }
        return result;
    }
    public static void main(String[] agrs){
        List<List<String>> lines = new ArrayList<>();
        List<String> scripts = new ArrayList<>();
        scripts.add("add");
        scripts.add("hack");
        lines.add(scripts);
        scripts = new ArrayList<>();
        scripts.add("add");
        scripts.add("hackerrank");
        lines.add(scripts);
        scripts = new ArrayList<>();
        scripts.add("find");
        scripts.add("hac");
        lines.add(scripts);
        scripts = new ArrayList<>();
        scripts.add("find");
        scripts.add("hak");
        lines.add(scripts);

        System.out.println(contacts(lines));
    }
}
