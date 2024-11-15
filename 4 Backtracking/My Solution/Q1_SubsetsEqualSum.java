/*
Q1. Given an integer array arr and an integer k, return true if it is
possible to divide the vector into k non-empty subsets with equal sum.

Input: arr = [1,3,2,2] k = 2
Output: true
Explanation: 1 + 3 and 2+2 are two subsets with equal sum.
*/

// TC = O(2^n⋅k)
// SC = O(n)
public class Q1_SubsetsEqualSum
{
    /*
    Recursive helper function to check if it is possible to divide the array into k subsets with equal sum.
    Parameters:
    - arr: The input integer array.
    - vis: A visited array to track elements already included in a subset.
    - si: The starting index for iteration.
    - curr_sum: The current sum of the subset being formed.
    - target: The target sum for each subset.
    - k: The number of subsets still to be formed.
    */
    public static boolean helper(int []arr , int []vis , int si , int curr_sum , int target , int k)
    {
        // If only one subset is left, the remaining elements will form the subset.
        if(k==1)
        {
            return true;
        }

        // If the current sum exceeds the target, return false as the subset is invalid.
        if(curr_sum>target)
        {
            return false;
        }

        // If the current subset's sum equals the target, move on to the next subset.
        if(curr_sum==target)
        {
            return helper(arr,vis,0,0,target,k-1);
        }

        // Try including each element in the current subset.
        for(int i=si;i<arr.length;i++)
        {
            // Check if the current element is not yet included.
            if(vis[i]==-1)
            {
                vis[i]=1; // Mark the element as included.
                // Recursively attempt to form the subset with the current element included.
                if(helper(arr,vis,i+1,curr_sum+arr[i],target,k))
                {
                    return true;
                }
                vis[i]=-1; // Backtrack and mark the element as not included.
            }
        }

        // Return false if no valid subset can be formed.
        return false;
    }

    /*
    Main function to determine if the array can be partitioned into k subsets with equal sum.
    Parameters:
    - arr: The input integer array.
    - k: The number of subsets.
    */
    public static boolean canPartition(int []arr, int k)
    {
        int n=arr.length;

        // Visited array to track elements already used in subsets.
        int []vis = new int[n];
        for(int i=0;i<n;i++)
        {
            vis[i] = -1; // Initialize all elements as not visited.
        }

        int sum=0;
        // Calculate the total sum of the array.
        for (int j : arr)
        {
            sum += j;
        }

        // If the total sum is not divisible by k, partitioning is not possible.
        if(sum%k!=0)
        {
            return false;
        }

        // Start the recursive helper function with target as the sum of each subset.
        return helper(arr,vis,0,0,sum/k,k);
    }

    public static void main(String[] args)
    {
        int []arr = {1 , 3 , 2 , 2}; // Input array.
        int k = 2; // Number of subsets.

        // Check if partitioning is possible and print the result.
        if(canPartition(arr, k))
        {
            System.out.println("Yes it is possible to partition the array.");
        }
        else
        {
            System.out.println("No it is not possible to partition.");
        }
    }
}
