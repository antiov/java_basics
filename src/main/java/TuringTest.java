import java.util.*;

public class TuringTest {
    public static void main(String[] args2){
        args2 = new String[]{"5", "2", "C", "D", "+"};
        List<String> args = new ArrayList<String>();
        Stack<Integer> q = new Stack<Integer>();
        for(int i = 0; i<args2.length;i++){
            args.add(args2[i]);
        }
        for(int i = 0; i<args2.length;i++){
            if(args.get(i) == "+") {
                Stack<Integer> q_aux = (Stack<Integer>) q.clone();
                int a = q_aux.pop();
                int b = q_aux.pop();
                q.add(a+b);
            }
            else if(args.get(i)== "D")
                q.add(2*q.peek());
            else if(args.get(i) == "C") {
                q.pop();
            }else{
                q.add(Integer.parseInt(args.get(i)));
            }
            System.out.println("q="+ q);
        } System.out.println("Resultado:" + q.stream().mapToInt(i -> i).sum());
    }
}
