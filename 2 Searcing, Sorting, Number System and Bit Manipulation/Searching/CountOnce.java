/*
 * Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
    Input1:arr=[0,0,0,0,1,1,1,1,1,1]
    Output 1: 6

    Input2:arr=[0,0,0,0,0,1,1]
    Output 2: 2
 */

import java.util.Scanner;

public class CountOnce 
{
    //T.C = O(log n)
    //S.C = O(1) 
    public static int countOnce(int [] arr)
    {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) 
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return (arr.length-low);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the element in an array: ");
        //T.C = O(n)
        //S.C = O(1) 
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Count of '1s' of the element is: " + countOnce(arr));
    
    }
}
