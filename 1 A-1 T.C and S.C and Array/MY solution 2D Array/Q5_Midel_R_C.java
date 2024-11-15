/*

 * Q5: Write a function which accepts a 2D array of integers and its size as arguments and
    displays the elements of middle row and the elements of middle column.
    Printing can be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

 */

import java.util.Scanner;

public class Q5_Midel_R_C 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the matrix element");
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
                if(j==(n-1)/2 || i==(n-1)/2)
                    System.out.print(arr[i][j] + " ");
            }
        }

    }
}
