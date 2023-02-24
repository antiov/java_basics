package hackerrank;
import java.io.*;
import java.util.Stack;
import java.util.stream.*;

class BalancedBracketsO {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        // Write your code here
        for(int i = 0; i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch.equals('[')||ch.equals('{')||ch.equals('(')){
                stack.push(s.charAt(i));
            }else{
                if(ch.equals(']')||ch.equals('}')||ch.equals(')')){
                    if(ch.equals(']') && stack.peek().equals('[')){
                        stack.pop();
                        continue;
                    }
                    if(ch.equals('}') && stack.peek().equals('{')){
                        stack.pop();
                        continue;
                    }
                    if(ch.equals(')') && stack.peek().equals('(')){
                        stack.pop();
                        continue;
                    }
                    return "NO";
                }
            }
        }
        return "YES";
    }

}

public class BalancedBrackets {
    public static void main(String[] args) throws IOException {
        String test = "{{[[(())]]}}";
        System.out.println("testString:" + test);
        System.out.println(BalancedBracketsO.isBalanced(test));
    }
}
