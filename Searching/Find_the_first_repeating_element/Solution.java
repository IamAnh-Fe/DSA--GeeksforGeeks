package Searching.Find_the_first_repeating_element;
// Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
// Output: 6 
public class Solution {
  public static void Find(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if(arr[i] == arr[j]){
          System.out.println(arr[i]);
          i = n ; j  = n ;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
    Find(arr);
  }
}
