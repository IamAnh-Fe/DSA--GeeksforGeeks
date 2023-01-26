package Array.Find_the_element_that_appears_once_in_an_array_where_every_other_element_appears_twice;
// Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
// Output: 2 
public class Solution {
  
  public static void BruteForce(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if(arr[i] == arr[j]){
          count++;
        }
      }
      if(count == 1){
        System.out.println(arr[i]);
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 4, 5, 3, 4};
    BruteForce(arr);    
  }

}
