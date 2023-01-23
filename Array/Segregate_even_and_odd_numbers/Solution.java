package Array.Segregate_even_and_odd_numbers;
// Input: arr[] = 1 9 5 3 2 6 7 11
// Output: 2 6 5 3 1 9 7 11

import java.util.Arrays;

// Input: arr[] = 1 3 2 4 7 6 9 10
// Output:  2 4 6 10 7 1 9 3
public class Solution {
  public static void BruteForce(int[] arr){
    int[] a = new int[arr.length];
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if(arr[i] % 2 == 0){
        a[count] = arr[i];
        count++;
      }
    }
      for (int i = 0; i < a.length; i++) {
        if(arr[i] % 2 != 0){
          a[count] = arr[i];
          count++;
        }
        
      }
      
      System.out.println(Arrays.toString(a));
    }

  public static void arrayEvenAndOdd(int[] arr){
    int i = -1, j = 0;
    while(j != arr.length){
      if(arr[j] % 2 == 0 ){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      j++;
    }
    System.out.println(Arrays.toString(arr));
      } 

    public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 4, 7, 6, 9, 10};
    BruteForce(arr);
    arrayEvenAndOdd(arr);
  }
}
