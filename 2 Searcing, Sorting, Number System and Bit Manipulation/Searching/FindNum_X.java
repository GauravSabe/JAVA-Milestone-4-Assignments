import java.util.Scanner;

/**
 * Q1. Given an array. FInd the number X in the array. 
       If the element is present, return the index of the element, else print “Element not found in array”. 
       Input the size of array, array from user and the element X from user. Use Linear Search to find the element.
 */

//T.C = O(n)
//S.C = O(1)
public class FindNum_X 
{
    public static int findTheIndexOf(int [] arr, int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the element in array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number did you find: ");
        int x = sc.nextInt();

        int result = findTheIndexOf(arr, x);
        if(result != -1)
        {
            System.out.println("Element is present in an array of index: " + result);
        }
        else
        {
            System.out.println("Element not found in array.");
        }

        
    }
}