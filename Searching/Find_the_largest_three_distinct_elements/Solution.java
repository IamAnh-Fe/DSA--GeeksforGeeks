package Searching.Find_the_largest_three_distinct_elements;


// Input: arr[] = {10, 4, 3, 50, 23, 90}
// Output: 90, 50, 23
public class Solution { 
public static void BruteForce(int[] arr){
int first, second, third;
third = second = first = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
  if(arr[i] > first){
    third = second;
    second = first;
    first = arr[i];
  } else if(arr[i] > second){
    third = second;
    second = arr[i];
  } else if(arr[i] > third){
    third  =arr[i];
  }
}
System.out.println(third + " " +  second + " " +  first);
}
  public static void main(String[] args) {
  int[] arr = {10, 4, 3, 50, 23, 90};
  BruteForce(arr);  
  }
}
