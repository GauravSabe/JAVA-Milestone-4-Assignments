/*
 * Q3: Print the max value of an array
 * Ex : [ 13, 1, -3, 22, 5].
 * output : 22
 */

// TC = O(n)
// SC = O(n)
public class MaxElement
{
    public static int maxValue(int [] arr, int idx)
    {
        int n=arr.length;
        if(idx == n - 1)
        {
            return arr[n - 1];
        }
        else
        {
            int maxOfLaterIndices = maxValue(arr, idx + 1);
            return Math.max(arr[idx], maxOfLaterIndices);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={13,1,-3,22,5};
        System.out.println("The max value is : " + maxValue(arr,0));
    }
}
