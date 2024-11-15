import java.util.Arrays;
import java.util.Scanner;

/**
 * Q1. Write a program to sort an array in descending order using bubble sort. 
 
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0}

 */

//T.C = O(n^2)
//S.C = O(1)
public class DescendingBubbleSort
{
    public static void descendingOrder(int [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the element in an array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        descendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}