/*
 * Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array.
       If the target is not present return -1.

    Input1:arr=[1,1,1,2,3,4,4,5,6,6,6,6], target=4
    Output 1: 6

    Input2:arr=[2,2,2,6,6,1,8,2,9,3,0,3,0,3,0], target=15
    Output 2: -1

 */

import java.util.Scanner;
public class LastOccurrence
{

    //T.C = O(log n)
    //S.C = O(1)    
    public static int lastOccurrence(int [] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        int result = -1;

        while (low <= high) 
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                result = mid;
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
        return result;

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

        System.out.println("Enter the number did you find the last occurrence: ");
        int target = sc.nextInt();

        int result = lastOccurrence(arr, target);
        System.out.println("Last occurrence of the element is: " + result);
    }
}
