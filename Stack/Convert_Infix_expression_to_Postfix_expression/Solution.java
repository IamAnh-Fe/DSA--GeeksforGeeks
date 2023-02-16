package Stack.Convert_Infix_expression_to_Postfix_expression;
// Input: A + B * C + D
// Output: ABC*+D+

import java.util.ArrayDeque;
import java.util.Deque;

// Input: ((A + B) – C * (D / E)) + F
// Output: AB+CDE/*-F+  
public class Solution {
  public static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }


  public static String infixToPostfix(String exp){
    String result = new String("");
    Deque<Character> stack = new ArrayDeque<Character>();
    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);
      if(Character.isLetterOrDigit(c)){
        result += c;
      } else if(c == '('){
        stack.push(c);
      } else if(c == ')'){
        while (!stack.isEmpty() && stack.peek() != '(') {
          result += stack.peek();
          stack.pop();
        }
        stack.pop();
      } else {
        while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
          result += stack.peek();
          stack.pop();
        }
        stack.push(c);
      }
    }

    while (!stack.isEmpty()) {
      if(stack.peek() == '('){
        return "Invalid Expression";
      }
      result += stack.peek();
      stack.pop();
    }
    return result;
  }
  public static void main(String[] args) {
    String exp = "a+b*c+d";
    System.out.println(infixToPostfix(exp));

  }
}
