package Array.Rearrange_an_array_in_maximum_minimum_form_using_Two_Pointer_Technique;
import java.util.Arrays;
// Input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
// Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

// Input: arr[] = {1, 2, 3, 4, 5, 6} 
// Output: arr[] = {6, 1, 5, 2, 4, 3} 
public class Solution {
  public static void TwoPointers(int[] arr) {
    int[] temp =  arr.clone();
    int small = 0, large = arr.length -1;
    boolean flag = true;
    for (int i = 0; i < temp.length; i++) {
      if(flag){
        arr[i] = temp[large--];
      } else {
        arr[i] = temp[small++];
      }
      flag = !flag;
    } 
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    TwoPointers(arr);
    System.out.println(Arrays.toString(arr));
  }
}
