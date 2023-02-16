package Stack.Postfix_to_Infix;
// Input : abc++
// Output : (a + (b + c))

import java.util.Stack;

// Input  : ab*c+
// Output : ((a*b)+c)
public class Solution {
  public static boolean isOperator(char x){
    return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
  }
  public static String getInfix(String exp){
    Stack<String> stack = new Stack<String>();
    for (int i = 0; i < exp.length(); i++) {
      if(isOperator(exp.charAt(i))){
        stack.push(exp.charAt(i) + "");
      } else {
        String op1 = stack.peek();
        stack.pop();
        String op2 = stack.peek();
        stack.pop();
        stack.push("(" + op2 + exp.charAt(i) + op1 + ")");
        }
      }
      return stack.peek();
    }
  public static void main(String[] args) {
    String post_exp = "ab*c+";
    System.out.println( getInfix(post_exp));
    }
}
