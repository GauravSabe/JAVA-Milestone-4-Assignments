
/*
 * Q2: write a program to print the elements above the secondary diagonal in a user inputted square matrix.
 */

import java.util.Scanner;
public class Q2_PrintAboveESecondaryD 
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

         System.out.println("Display the element of above secondary diagonal: ");
         for(int i=0; i<m-1; i++)
         {
             for(int j=0; j<n-1; j++)
             {
                 System.out.print(arr[i][j] + " ");
             }
             n = n-1;
         }

        //Approach - 2
        //T.C = O(m*n)
        //S.C = O(1)

        System.out.println("Display the element of above secondary diagonal: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i+j < n-1)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


        
    }
}
