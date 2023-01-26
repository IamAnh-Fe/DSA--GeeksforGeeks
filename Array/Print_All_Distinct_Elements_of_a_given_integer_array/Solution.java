package Array.Print_All_Distinct_Elements_of_a_given_integer_array;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
  public static void BruteForce(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      int j;
      for ( j = 0; j < i; j++) {
        if(arr[i] == arr[j]){
          break;
        }
      }
      if(i == j){
        System.out.print(arr[i] + " ");
      
      }
    }
  }
  
  public static void Sorting(int[] arr){
    Arrays.sort(arr);
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      while (i < n - 1 && arr[i] == arr[i + 1]) {
        i++;
      }
      System.out.print(arr[i] + " ");
    }
  }

  public static void Hashing(int[] arr){
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if(!set.contains(arr[i])){
        set.add(arr[i]);
        System.out.print(arr[i] + " ");
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
    BruteForce(arr);
    Sorting(arr);
    Hashing(arr);
  }
}
