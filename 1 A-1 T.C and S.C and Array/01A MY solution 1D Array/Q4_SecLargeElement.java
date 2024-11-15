/*
 * Q4: Write a program to find out the second-largest element in a given array.
 
    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 54

    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 6
 */



public class Q4_SecLargeElement 
{
    public static void main(String[] args) 
    {
        //Approach - 1
        //T.C = O(n)
        //S.C = O(1)

         int [] arr2 = {1, 6, 3, 8, 17, 14};
         int max1 = arr2[0];
         for(int i=1; i<arr2.length; i++)
         {
             if(arr2[i] > max1)
             {
                 max1 = arr2[i];
             }
         }

         int sln= arr2[0];
         for(int i=1; i<arr2.length; i++)
         {
             if(arr2[i] == max1)
             {
                 continue;
             }
             if(arr2[i] > sln)
             {
                 sln = arr2[i];
             }
         }
         System.out.println(sln);


        System.out.println("-----------------------------------------------------------------");


        // Approach - 2
        // T.C = O(n)
        // S.C = O(1)

         int [] arr = {34,21,54,65,43};
        
         if(arr.length < 2)
         {
             System.out.println("Array should have at least two elements");
         }

         int max = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;

        for (int elem : arr)
        {
            if (elem > max)
            {
                secondMax = max;
                max = elem;
            }
            if (elem > secondMax && elem != max)
            {
                secondMax = elem;
            }
        }

         if(secondMax == Integer.MIN_VALUE)
         {
             System.out.println("There is no second-largest element.");
         }
         else
         {
             System.out.println("The second-largest element is: " + secondMax);
         }


        System.out.println("-----------------------------------------------------------------");


        // Approach - 3: Find the second-largest element in an array
        // Time Complexity: O(n), Space Complexity: O(1)

        int[] arr1 = { 34, 21, 54, 65, 43 }; // Example array
        int arr_size = arr1.length; // Get the size of the array

        // There should be at least two elements in the array to find the second-largest
        if(arr_size < 2)
        {
            System.out.println("Invalid Input. Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE; // Initialize largest to minimum possible value
        int second = Integer.MIN_VALUE;  // Initialize second-largest to minimum possible value

        // Find the largest element in the array
        for (int elem : arr1) {
            largest = Math.max(largest, elem); // Update largest if current element is greater
        }

        // Find the second-largest element in the array
        for (int elem : arr1) {
            // If the current element is not equal to the largest, update the second-largest
            if (elem != largest) {
                second = Math.max(second, elem); // Update second-largest if condition holds
            }
        }

        // If second-largest remains the minimum value, that means there is no valid second-largest
        if(second == Integer.MIN_VALUE)
        {
            System.out.println("There is no second-largest element.");
        }
        else
        {
            System.out.println("The second-largest element is: " + second);
        }

    }
}
