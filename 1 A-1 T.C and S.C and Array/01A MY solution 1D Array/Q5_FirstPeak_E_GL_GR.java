/*
  *Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.

    Input 1: arr[] = {1,3,2,6,5}
    Output 1: 3

    Input 2: arr[] = {1 4,7,3,2,6,5}
    Output 1: 7
 */

public class Q5_FirstPeak_E_GL_GR
{
    //first peak element

    public static void main(String[] args) 
    {
        //Approach - 1
        //T.C = O(n)
        //S.C = O(1)
        int [] arr1 = {1,4,7,3,2,6,5};

        for(int i=1; i<arr1.length-1; i++)
        {
            if(arr1[i-1] < arr1[i] && arr1[i] > arr1[i+1])
            {
                System.out.println(arr1[i]);
                break;
            }
        }

    } 
}