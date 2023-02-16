package Stack.Prefix_to_Postfix_Conversion;
// Input :  Prefix :  *+AB-CD
// Output : Postfix : AB+CD-*
// Explanation : Prefix to Infix :  (A+B) * (C-D)
//               Infix to Postfix :  AB+CD-*

import java.util.Stack;

// Input :  Prefix :  *-A/BC-/AKL
// Output : Postfix : ABC/-AK/L-*
// Explanation : Prefix to Infix :  (A-(B/C))*((A/K)-L)
//               Infix to Postfix : ABC/-AK/L-* 
public class Solution {
  public static boolean isOperator(char x)
    {
        switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
        }
        return false;
    }
  public static String preToPost(String pre_exp){
    Stack<String> s = new Stack<String>();
    int length = pre_exp.length();
  for (int i = length - 1; i >= 0; i--) {
    if(isOperator(pre_exp.charAt(i))){
      String op1 = s.peek();
      s.pop();
      String op2 = s.peek();
      s.pop();
      String temp = op1 + op2 + pre_exp.charAt(i);
      s.push(temp);
    } else {
      s.push(pre_exp.charAt(i) + "");
    }
  }  
  return s.peek();
}
  public static void main(String[] args) {
    String pre_exp = "*-A/BC-/AKL";
    System.out.println("Postfix : "
    + preToPost(pre_exp));
  }
}
