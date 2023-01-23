package Array.Print_left_rotation_of_array;
// Input : 
// arr[] = {1, 3, 5, 7, 9}
// k1 = 1
// k2 = 3
// k3 = 4
// k4 = 6
// Output : 
// 3 5 7 9 1
// 7 9 1 3 5
// 9 1 3 5 7
// 3 5 7 9 1

// Input : 
// arr[] = {1, 3, 5, 7, 9}
// k1 = 14 
// Output : 
// 9 1 3 5 7
public class Solution {
  public static void BruteForce(int[] arr,int k){
    int n  = arr.length;
    int mod = k % n;
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[(i + mod) % n]);
    }

  }
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    int k = 1;
    BruteForce(arr, k);
  }
}
