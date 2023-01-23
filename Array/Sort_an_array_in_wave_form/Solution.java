package Array.Sort_an_array_in_wave_form;

import java.util.Arrays;

// Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
// Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} 
// Input: arr[] = {20, 10, 8, 6, 4, 2}
// Output: arr[] = {20, 8, 10, 4, 6, 2}
public class Solution {
  public static void BruteForce(int[] arr){
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i += 2) {
      swap(arr, i, i+1);
    }
  }
  public static void swap(int arr[], int a, int b)
  {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
  }
  public static void main(String[] args) {
    int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
    BruteForce(arr);
    System.out.println(Arrays.toString(arr));
  }
}
