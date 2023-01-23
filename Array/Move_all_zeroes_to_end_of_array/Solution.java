package Array.Move_all_zeroes_to_end_of_array;
// Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
// Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

// Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
// Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 
public class Solution {
  public static void BruteForce(int[] arr, int n) {  
    int count = 0;  
    for (int i = 0; i < n; i++){
      if (arr[i] != 0){
        arr[count++] = arr[i]; 
        System.out.println(arr[1] );
      }
    }
    while (count < n)
        arr[count++] = 0;
  }
  public static void main(String[] args) {
    int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
    int n = arr.length;
    BruteForce(arr, n);
    System.out.println("Array after pushing zeros to the back: ");
    for (int i=0; i< n; i++)
        System.out.print(arr[i]+" ");
  }
}
