/*
 * Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. 
    If the element is not found in the array, report that as well.

    Input:nums[]=[2,5,5,5,6,6,8,9,9,9]
    target = 5
    Output: Target 5 occurs 3 times
 
    Input:nums[]=[2,5,5,5,6,6,8,9,9,9]
    target = 6
    Output: Target 6 occurs 2 times
 */

//Approach - 2
//T.C = O(log n)
//S.C = O(1)

import java.util.Scanner;

public class duplicateCountGN 
{
    //find first occurrence of the target
    public static int firstOccurrence(int [] arr, int target, int low, int high)
    {
        int firstResult = -1; 
        while (low <= high) 
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                firstResult = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }         
        }
        return firstResult;      
    }

    //find last occurrence of the target
    public static int lastOccurrence(int [] arr, int target, int low, int high)
    {
        int lastResult = -1; 
        while (low <= high) 
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                lastResult = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }         
        }
        return lastResult;
    }


    //count occurrences of a given number or target   
    public static int duplicateCountByGivenNumber(int firstResult, int lastResult)
    {
        if(firstResult == -1)
        {
            return 0;
        }
        else
        {
            return lastResult - firstResult + 1;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        //T.C = O(n)
        //S.C = O(1)
        System.out.println("Enter the element in an array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number did you find the count of number: ");
        int target = sc.nextInt();

        //Approach - 1
        //T.C = O(n)
        //S.C = O(1)

         int count1 = 0;
         for(int i=0; i<n; i++)
         {
             if(arr[i] == target)
             {
                 count1++;
             }
         }
         System.out.println("Target " + target + " occurs " + count1 + " times.");

        //Approach - 2
        //T.C = O(log n)
        //S.C = O(1)
        int firstResult = firstOccurrence(arr, target, 0, n-1);
        int lastResult = lastOccurrence(arr, target, 0, n-1);

        int count = duplicateCountByGivenNumber(firstResult, lastResult);
        if (count > 0) 
        {
            System.out.println("Target " + target + " occurs " + count + " times");
        } 
        else 
        {
            System.out.println("Target " + target + " is not found");
        }

    }
}
