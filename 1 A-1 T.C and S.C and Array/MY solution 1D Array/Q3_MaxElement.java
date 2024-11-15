/*
 Q3: Write a program to calculate the maximum and minimum element in the array.
    
    Input 1: arr[] = {34,21,54,65,43}
    Output 1: max = 65 , min = 21

    Input 1: arr[] = {4,3,6,7,1}
    Output 1: max = 7 , min = 1
 */

import java.util.Arrays;

public class Q3_MaxElement 
{
    public static void main(String[] args) 
    {
        //Approach - 1
        //T.C = O(n^2)
        //S.C = O(1)

         int [] arr = {1, 2, 4, 7, 5};
         for(int i=0; i<arr.length; i++)
         {
             for(int j=i+1; j<arr.length; j++)
             {
                 if(arr[i] > arr[j])
                 {
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         System.out.println("Maximum element in the array is: " + arr[arr.length-1]);
         System.out.println("Minimum element in the array is: " + arr[0]);


        System.out.println("-----------------------------------------------------------------");


        //Approach - 2
        //T.C = O(n)
        //S.C = O(1)

        int [] arr1 = {1, 2, 4, 7, 5};
        int max = arr1[0];
        for(int i=1; i<arr1.length; i++)
        {
            if(arr1[i] > max)
            {
                max = arr1[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);

        int min = arr1[0];
        for(int i=1; i<arr1.length; i++)
        {
            if(arr1[i] < min)
            {
                min = arr1[i];
            }
        }
        System.out.println("Minimum element in the array is: " + min);



        System.out.println("-----------------------------------------------------------------");


        //Approach - 3
        //T.C = O(n)
        //S.C = O(1)

         int [] arr3 = { 1, 2, 4, 7, 5 };
         int max1 = Integer.MIN_VALUE;
         int min1 = Integer.MAX_VALUE;

         for (int element : arr3)
         {
             max1 = Math.max(max1, element);
             min1 = Math.min(min1, element);
         }
         System.out.println("Maximum element in the array is:  " + max1);
         System.out.println("Minimum element in the array is:  " + min1);



        System.out.println("-----------------------------------------------------------------");


        
        //Approach - 4
        //T.C = O(n * log(n))
        //S.C = O(1)
        int [] arr4 = {1, 2, 4, 7, 5};
        
        Arrays.sort(arr4);
        
        long min2 = arr4[0];
        long max2 = arr4[arr4.length - 1];

        System.out.println("Maximum element in the array is:  " + max2);
        System.out.println("Minimum element in the array is:  " + min2);
    }
}
