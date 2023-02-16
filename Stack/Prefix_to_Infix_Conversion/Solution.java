package Stack.Prefix_to_Infix_Conversion;
// Input :  Prefix :  *+AB-CD
// Output : Infix : ((A+B)*(C-D))

import java.util.Stack;

// Input :  Prefix :  *-A/BC-/AKL
// Output : Infix : ((A-(B/C))*((A/K)-L))
public class Solution {
  public static String convert(String str){
    Stack<String> stack = new Stack<>();
    int l = str.length();
    for (int i = l - 1; i >= 0; i--) {
      char c = str.charAt(i);
      if(isOperator(c)){
        String op1 = stack.pop();
        String op2 = stack.pop();
        System.out.println("op1" + op1);
        System.out.println("op2" + op2);

        String temp = "(" + op1 + c + op2 + ")";
        stack.push(temp);
      } else {
        stack.push(c + "");
      }
    }
    return stack.pop();
  }

  public static boolean isOperator(char x){
    switch(x){
        case '+':
        case '-':
        case '*':
        case '/':
        case '^':
        case '%':
            return true;
    }
    return false;
  }
 public static void main(String[] args) {
  String exp = "*+AB-CD";
  System.out.println("Infix : " + convert(exp));
 } 
}
