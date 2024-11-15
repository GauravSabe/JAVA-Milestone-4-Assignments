/*
 * Q2. Given an integer array arr, print all the possible permutations of the given array.
 
    Note : The array will only contain non repeating elements.

    Input 1 : arr = [1, 2, 3]
    Output1 : [[1,2,3] , [1,3,2] , [2,1,3] , [2,3,1] , [3,1,2] , [3,2,1]]

 */

// TC O(n * n!)
// SC O(n * n!)

import java.util.*;
public class Q2_PossiblePermutations
{
    // Method to generate all permutations of the given array
    public static void permute(int[] nums)
    {
        // List to store all permutations
        List<List<Integer>> result = new ArrayList<>();
        // If the input array is null or empty, return
        if (nums == null || nums.length == 0)
        {
            return;
        }

        // Helper method to compute permutations
        permutationsHelper(result, nums, 0);

        // Print all generated permutations
        for(List<Integer> list : result)
        {
            for(Integer item : list)
            {
                System.out.print(item + "  "); // Print each element of the permutation
            }
            System.out.println(); // Print new line after each permutation
        }
    }

    // Helper method to compute permutations recursively
    private static void permutationsHelper(List<List<Integer>> result, int[] nums, int start)
    {
        // Base case: If start reaches the last index, add the current permutation to the result
        if (start == nums.length - 1)
        {
            List<Integer> list = new ArrayList<>();
            for (int n : nums)
            {
                list.add(n); // Add each element of nums to the list
            }
            result.add(list); // Add the list to the result
            return;
        }
        // Generate permutations by swapping elements
        for (int i = start; i < nums.length; i++)
        {
            swap(nums, start, i); // Swap elements at indices start and i
            permutationsHelper(result, nums, start + 1); // Recursive call with start incremented
            swap(nums, start, i); // Swap back to restore the original array
        }
    }

    // Utility method to swap two elements in the array
    private static void swap(int[] nums, int x, int y)
    {
        int t = nums[x]; // Temporary variable to store nums[x]
        nums[x] = nums[y]; // Assign nums[y] to nums[x]
        nums[y] = t; // Assign t (original nums[x]) to nums[y]
    }

    // Main method to execute the program
    public static void main(String[] args)
    {
        // Input array
        int []arr = {1 , 2 , 3};
        System.out.println("The possible permutations are : ");
        permute(arr); // Call the permute method to generate and display permutations
    }
}

