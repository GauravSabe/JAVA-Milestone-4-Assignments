/*
 * Q1: Write a program to print the sum of all the elements present on even indices in the given array.
    
    Input 1: arr[] = {3,20,4,6,9}
    Output 1: 16
    
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 11
 */

import java.util.*;

public class Q1_SumEvenIndex 
{

    public static void main(String[] args) 
    {
           Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array: ");
//         int m = sc.nextInt();
//
//         int [] arr = new int[m];
//         System.out.println("Enter the element in an array: ");
//         //T.C = O(m)
//         for(int i=0; i<m; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//
//         System.out.println("Array is: " +Arrays.toString(arr));


        //Approach - 1
        // T.C = O(n)
        // S.C = O(1)

         int [] arr = {3,20,4,6,9};
         int n = arr.length;
         int sum = 0;
         for(int i=0; i<n; i+=2)
         {
             sum += arr[i];
         }
         System.out.println("Sum of even indices is: " + sum);


        //Approach - 2
        // T.C = O(n)
        // S.C = O(1)

         System.out.println("Enter the size of the array: ");
         int n1 = sc.nextInt();

         int sum1 = 0;
         System.out.println("Enter the elements of the array: ");
         for (int i = 0; i < n1; i++)
         {
             int element = sc.nextInt();
             if (i % 2 == 0)
             {
                 sum1 += element;
             }
         }
         System.out.println("Sum of elements at even indices is: " + sum1);

        
        //Approach - 3
        //T.C = O(n)
        //S.C = O(1)
        int [] arr2 = {3,20,4,6,9};
        int n2 = arr.length;
        int sum2 = 0;

        // for(int i=0; i<n2; i++)
        // {
        //     if(i%2==0)
        //     {
        //         sum2 += arr2[i];
        //     }
        // }

        int i=0;
        while (i<n2)
        {
            if(i%2==0)
            {
                sum2 += arr2[i];
            }
            i++;
        }
        System.out.println("Sum of even indices is: " + sum2);
    }
}