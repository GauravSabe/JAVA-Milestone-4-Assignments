/*
 * Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
    number of positive numbers
    number of negative numbers
    number of odd numbers
    number of even numbers
    number of 0.
 */

 //T.C = O(m*n)
 //S.C = O(1)
import java.util.Scanner;

public class Q1_CountNumberType 
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

        int positive = 0, negative = 0, odd = 0, even = 0, zeros = 0;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] > 0)
                {
                    positive++;
                }
                if(arr[i][j] < 0)
                {
                    negative++;
                }
                if(arr[i][j]%2 == 0)
                {
                    even++;
                }
                if(arr[i][j]%2 != 0)
                {
                    odd++;
                }
                if(arr[i][j] == 0)
                {
                    zeros++;
                }
            }
        }

        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of zeros numbers: " + zeros);
    }
}