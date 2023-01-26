package Array.Count_the_number_of_possible_triangles;

import java.util.Arrays;

// Input: arr= {4, 6, 3, 7}
// Output: 3
public class Solution {
  public static int BruteForce(int[] arr){
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int j2 = j +  1; j2 < arr.length; j2++) {
          if(arr[i] + arr[j] > arr[j2] ){
            count++;
          }
        }
      }
    }
    return count;
  }

  public static int Sorting(int[] arr){
    int n = arr.length;
    Arrays.sort(arr);
    int count = 0;
    for (int i = 0; i < n - 2; i++) {
      int k = i + 2;
      for (int j = i + 1; j < n; j++) {
        while (k < n && arr[i] + arr[j] > arr[k]) {
          ++k;
        }
        if(k > j){
          count += k - j - 1;
        }
      }
    }
    return count;
  }

  public static int TwoPoiters(int[] arr){
    int n = arr.length; 
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    count += r - l;
                    r--;
                }
                else 
                {
                    l++;
                }
            }
        }
        return count;
    }
  public static void main(String[] args) {
    int[] arr = {4, 6, 3, 7};
    
    System.out.println(BruteForce(arr));
    System.out.println(Sorting(arr));
    System.out.println(TwoPoiters(arr));
  }
}
