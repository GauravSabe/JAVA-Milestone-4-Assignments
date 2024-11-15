/*
 * Q3: write a program to print the elements of both the diagonals in a user inputted square matrix in any order.
 */

import java.util.Scanner;

public class Q3_DispDiagonalElem
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the matrix element: ");
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

         for(int i=0; i<m; i++)
         {
             for(int j=0; j<n; j++)
             {
                if(i==j || i+j==n-1)
                     System.out.print(arr[i][j] + " ");
             }
         }


        //Approach - 2
        //T.C = O(n)
        //S.C = O(1)
        for(int i = 0 ; i < m ; i++)
        {        
            System.out.print(arr[i][i] + "  ");
    
            if(i != m-1-i)
                System.out.print(arr[i][m-1-i] + "  ");
        }

        
    }
}
