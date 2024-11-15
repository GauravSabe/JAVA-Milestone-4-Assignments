/*
Q4. Check if the product of some subset of an array is equal to the target value.

Input :n = 5 , target = 16
Array = [2 3 2 5 4]

Here the target will be equal to 2x2x4 = 16
Output : YES
 */


// TC O(2^n)
// SC O(n)

import java.util.*;

 public class Q4_ProductSubset
 {
     // Recursive function to check if a subset's product equals the target
     public static boolean solve(int n, int target, int [] a, int i, int product)
     {
         // Base case: if we have processed all elements
         if (i == n)
         {
             return (product == target); // Check if the current product equals the target
         }
         boolean answer = false;
 
         // Include the current element in the subset's product
         product *= a[i];
 
         // Recursive call to include the current element
         answer |= solve(n, target, a, i + 1, product);
 
         // Backtrack: exclude the current element from the subset's product
         product /= a[i];
 
         // Recursive call to exclude the current element
         answer |= solve(n, target, a, i + 1, product);
 
         return answer; // Return whether any subset satisfies the condition
     }
 
     public static void main(String[] args)
     {
         // Scanner to take input from the user
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of elements you want and the value of target respectively : ");
 
         int n = sc.nextInt(), target = sc.nextInt(); // Read number of elements and target value
         int [] a = new int[n]; // Array to store input elements
         System.out.println("Enter the array elements");
         for (int i = 0; i < n; i++) // Loop to read the array elements
         {
             a[i] = sc.nextInt();
         }
         // Call the solve method and print YES if a subset product equals the target, otherwise NO
         System.out.println((solve(n, target, a, 0, 1) ? "YES" : "NO"));

         sc.close();
     }
 }

 