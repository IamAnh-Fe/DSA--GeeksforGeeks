package Array.Leaders_in_an_array;
// Input: arr[] = {16, 17, 4, 3, 5, 2}, 
// Output: 17, 5, 2

// Input: arr[] = {1, 2, 3, 4, 5, 2}, 
// Output: 5, 2
public class Solution {
  public static void BruteForce(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      int j;
      for ( j = i + 1; j < arr.length; j++) {
        if(arr[i] <= arr[j]){
          break;
        }
      }
      if(j == arr.length){
        System.out.println(arr[i]);
      }
    }

  }
  public static void main(String[] args) {
    int[] arr = {16, 17, 4, 3, 5, 2};
    BruteForce(arr);
  }
}
