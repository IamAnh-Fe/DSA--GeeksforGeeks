package Array.Reversal_algorithm_for_array_rotation;
// Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
// Output: 3, 4, 5, 6, 7, 1, 2

import java.util.Arrays;

// Input: arr[] = {1, 6, 7, 8}, d = 3
// Output: 8, 1, 6, 7
public class Solution {
  public static void leftRotate(int[] arr, int d){
    if(d == 0){
      return;
    }
    int n = arr.length;
    d = d % n;
    reverseArray(arr, 0, d - 1);
    reverseArray(arr, d, n - 1);
    reverseArray(arr, 0, n - 1);
  }
  public static void reverseArray(int arr[], int start, int end){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int d = 2;
    leftRotate(arr, d);
    System.out.println(Arrays.toString(arr));
  }
}
