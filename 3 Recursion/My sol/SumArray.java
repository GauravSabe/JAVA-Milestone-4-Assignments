/*
 * Q4 : Find the sum of the values of an array
 *
 * Ex: [1,2,3,4,5]
 * output : 15
 * Explanation : 1 + 2 + 3 + 4 + 5 = 15

 */

// TC = O(n)
// SC = O(n)

public class SumArray 
{
    //AP - 1

     public static int sumArray(int [] arr, int n)
     {
         if(n<=0)
         {
             return 0;
         }
         else
         {
             return sumArray(arr, n-1) + arr[n-1];
         }
     }

    
    //AP - 2

    public static int sumArray_1(int [] arr1, int idx)
    {
        if(idx == arr1.length-1)
        {
            return arr1[idx];
        }
        else
        {
            return sumArray_1(arr1, idx + 1) + arr1[idx];
        }             
    }

    public static void main(String[] args) 
    {
        //AP - 1

         int[] arr={1,2,3,4,5};
         int n=arr.length;
         System.out.println("The max value is : " + sumArray(arr,n));

        //AP - 2
        int[] arr1={1,2,3,4,5};
        System.out.println("The max value is : " + sumArray_1(arr1, 0));


    }
}
