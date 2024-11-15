//Q4: Write a program to find the largest element of a given 2D array of integers.

import java.util.Scanner;

public class Q4_LargestElem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the mtrix element");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //Approach - 1
        //T.C = O(m*n)
        //S.C = O(1)

        int max = Integer.MIN_VALUE;
        //int max = arr[0][0];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element of an array: " + max);

    }
}
