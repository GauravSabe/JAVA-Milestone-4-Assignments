/*
 * Q2. WAP to sort an array in descending order using selection sort 
 
 Input Array {3,5,1,6,0} 
 Output Array: {6, 5, 3, 1, 0}

 */

import java.util.Arrays;
import java.util.Scanner;

//T.C = O(n^2)
//S.C = O(1)
public class DesendingSelectionSort 
{
    public static void descendingOrder(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int min_idx = i;
            for(int j=i+1; j<arr.length; j++)
            {          
                if(arr[j] > arr[min_idx])
                {
                    min_idx = j;
                }
            }
            if(min_idx != i)
            {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element in an array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        descendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}