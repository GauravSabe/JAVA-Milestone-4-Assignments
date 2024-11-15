import java.util.Scanner;

/**
 * Q1 : Given an integer, find out the sum of its digits using recursion.
 
Input: n= 1234
Output: 10

Explanation: 1+2+3+4=10

 */

// TC = O(log n)
// SC = O(log n)
public class SumOfNum 
{
    public static int findSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return (n%10 + findSum(n/10)); // '%10' ---> give last element ---> '/10' ---> removed last element  
        }       
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = findSum(n);
        System.out.println(result);       
    }
}