/*

Q3. Given a collection of numbers, nums, that might contain duplicates, 
return all possible unique permutations in any order.

Example 1:
input : nums = [1,1,2]
output : [[1,1,2], [1,2,1], [2,1,1]]

Example 2:
input : nums = [1,2,3]
output : [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

 */

// TC O(n log n + n * n!)
// SC O(n * n!)

import java.util.*;
public class Q3_UniquePermutation
{
    // Method to generate unique permutations of a given array
    public static void permuteUnique(int[] nums)
    {
        // List to store all unique permutations
        List<List<Integer>> result = new ArrayList<>();
        // If the input array is null or empty, return
        if(nums==null || nums.length==0)
        {
            return ;
        }
        // Array to track whether a number has been used in the current permutation
        boolean[] used = new boolean[nums.length];
        // Temporary list to store a single permutation
        List<Integer> list = new ArrayList<>();
        // Sort the array to handle duplicates
        Arrays.sort(nums);
        // Helper method to generate permutations
        go(nums, used, list, result);

        // Print all unique permutations
        for(List<Integer> li : result)
        {
            for(Integer item : li)
            {
                System.out.print(item + "  "); // Print each element of the permutation
            }
            System.out.println(); // Print new line after each permutation
        }
    }

    // Recursive helper method to generate permutations
    public static void go(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        // Base case: If the size of the list matches the array length, add it to results
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list)); // Add a copy of the current permutation
            return;
        }
        // Loop through the array to generate permutations
        for(int i=0;i<nums.length;i++)
        {
            // Skip already used numbers
            if(used[i])
            {
                continue;
            }
            // Skip duplicate numbers to avoid duplicate permutations
            if(i>0 && nums[i-1]==nums[i] && !used[i-1])
            {
                continue;
            }
            // Mark the current number as used and add it to the list
            used[i]=true;
            list.add(nums[i]);
            // Recursive call to continue generating permutations
            go(nums,used,list,res);
            // Backtrack: Unmark the current number and remove it from the list
            used[i]=false;
            list.remove(list.size() - 1); // Changed from removeLast() for compatibility
        }
    }

    // Main method to execute the program
    public static void main(String[] args)
    {
        // Input array
        int []arr = {1 , 2 , 3};
        System.out.println("The possible permutations are : ");
        permuteUnique(arr); // Call the method to generate unique permutations
    }
}
