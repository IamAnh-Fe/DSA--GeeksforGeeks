package Array.Sort_an_array_which_contain_1_to_n_values;

import java.util.Arrays;

// Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
// Output : 1 2 3 4 5 6 7 8 9 10 
public class Solution {
  public static void Sort(int[] arr){
    int i = 0;
    while(i < arr.length){
      int correct = arr[i] - 1;
      System.out.println(Arrays.toString(arr));
      if(arr[correct] != arr[i]){
        swap(arr, i , correct);
      } else {
        i++;
      }
    }
  } 
  public static void swap(int[] arr, int first, int second)
  {
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
  }
  public static void main(String[] args) {
    int[] arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
    Sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
