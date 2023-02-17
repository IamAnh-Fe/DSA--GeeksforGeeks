package Searching.Find_the_Missing_Number;
// Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
// Output: 5

import java.util.Arrays;

// Input: arr[] = {1, 2, 3, 5}, N = 5
// Output: 4
public class Solution {
  public static void Hashing(int[] arr, int n) {
    int temp[] = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      temp[i]  = 0;
    }
    for (int i = 0; i < n; i++) {
      temp[arr[i] - 1] = 1;
    } 
    System.out.println(Arrays.toString(temp));
    int ans  = 0;
    for (int i = 0; i <= n; i++) {
      if(temp[i] == 0){
        ans = i + 1;
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5};
    int n  = arr.length;
    Hashing(arr, n);
  }

}
