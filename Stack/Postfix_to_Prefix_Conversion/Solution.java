package Stack.Postfix_to_Prefix_Conversion;
// Input :  Postfix : AB+CD-*
// Output : Prefix :  *+AB-CD

import java.util.Stack;

// Input :  Postfix : ABC/-AK/L-*
// Output : Prefix :  *-A/BC-/AKL

public class Solution {
  public static boolean isOperator(char x){
    switch (x) {
      case '+':
      case '-':
      case '/':
      case '*':
          return true;
      }
      return false;
  }

  public static String postToPre(String post_exp){
    Stack<String> stack = new Stack<String>();
    int length = post_exp.length();
    for (int i = 0; i < length; i++) {
      if(isOperator(post_exp.charAt(i))){
        String op1 = stack.peek();
        stack.pop();
        String op2 = stack.peek();
        stack.pop();
        String temp = post_exp.charAt(i) + op2 + op1;
        stack.push(temp);
      } else {
        stack.push(post_exp.charAt(i) + "");
      }
    }
    String ans = "";
    for (String i : stack) {
      ans += i;
    }
    return ans;
  }
  public static void main(String[] args) {
    String post_exp =  "ABC/-AK/L-*";
    System.out.println("Prefix : "
    + postToPre(post_exp));

  }
}
