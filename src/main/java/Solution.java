import java.util.regex.Pattern;

class SolutionEx {
    public static String reverseOnlyLetters(String s) {
        String result = null;
        Pattern p = Pattern.compile("[a-zA-Z]");
        StringBuilder sb = new StringBuilder(s);
        for(int i =s.length()-1;i>=0;i--){
            if(p.matcher(String.valueOf(s.charAt(i))).matches()){
                System.out.println("Y=" + s.charAt(i));
                sb.setCharAt(s.length()-i-1, s.charAt(i));
            }else{
                System.out.println("N=" + s.charAt(i));
            }
        }
        result = sb.toString();
        return result;
    }
}
public class Solution{
  public static void main(String args[]){
        System.out.println("result="+SolutionEx.reverseOnlyLetters("a-bC-dEf=ghli!!")); //Result has been: j-lh-gfE=dCba!!
    }
}
