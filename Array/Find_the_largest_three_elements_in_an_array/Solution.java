package Array.Find_the_largest_three_elements_in_an_array;

import java.util.Arrays;

// Input: arr[] = {10, 4, 3, 50, 23, 90}
// Output: 90, 50, 23
public class Solution {
  public static void BruteForce(int[] arr) {
    int first, second, third;
    first =second = third = Integer.MIN_VALUE;
    if(arr.length < 3){
      System.out.print(" Invalid Input ");
      return;
    }
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > first){
        third = second;
        second = first;
        first = arr[i];
      } else if (arr[i] > second ) {
        third = second;
        second = arr[i];
      } else if(arr[i] > third){
        third = arr[i];
      }
    }
    System.out.println("Three largest elements are " + first + " " + second + " " + third);
  }
  public static void Sorting(int[] arr){
    Arrays.sort(arr);
    int x = arr.length;
    System.out.println("Three largest elements are " + arr[x-1] + " " + arr[x-2] + " " + arr[x-3]);
    
  }

  public static void main(String[] args) {
    int arr[] = {10, 4, 3, 50, 23, 90};
    BruteForce(arr);
    Sorting(arr);
  }
}
