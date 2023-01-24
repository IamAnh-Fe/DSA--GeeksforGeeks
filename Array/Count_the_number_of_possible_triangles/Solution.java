package Array.Count_the_number_of_possible_triangles;
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
  public static void main(String[] args) {
    int[] arr = {4, 6, 3, 7};
    
    System.out.println(BruteForce(arr));
  }
}
