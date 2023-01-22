package Array.Find_Second_largest_element_in_an_array;
// Input: arr[] = {12, 35, 1, 10, 34, 1}
// Output: The second largest element is 34.

// Input: arr[] = {10, 5, 10}
// Output: The second largest element is 5.

// Input: arr[] = {10, 10, 10}
// Output: The second largest does not exist.

public class Solution {
  public static void BruteForce(int[] arr) {
    int first, second;
    first = second = Integer.MIN_VALUE;
    if (arr.length < 2) {
      System.out.print(" Invalid Input ");
      return;
  }
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > first){
        second = first;
        first = arr[i];
      }else if(arr[i] > second && arr[i] != first){
        second = arr[i];
      }
    }
    if (second == Integer.MIN_VALUE){
      System.out.print("The second largest does not exist.");
    } else {
      System.out.println("Three largest elements is" + " " + second);
    }
  }
  public static void main(String[] args) {
    int arr[] = {10, 10 ,10 };
    BruteForce(arr);
  }
}
