/*
 * Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
 That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.

Constraints : 0 <= n <= 10^6
*
Input1 : n=10
Output 1 : -5
Explanation : 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5

Input2 : n=5
Output2 : 3
Explanation : 1 - 2 + 3 - 4 + 5 = 3

 */

// TC = O(n)
// SC = O(n)

import java.util.Scanner;

public class SumNaturalNumAlternativeSign 
{
    
    public static int findSumAlternativeSign(int n)
    {
        if(n==0)
        {
            return 0;
        }
        
        if(n%2 == 0)
        {
            return findSumAlternativeSign(n - 1) - n;
        }
        else
        {
            return findSumAlternativeSign(n - 1) + n;
        }


    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // int n = 10;

        int result = findSumAlternativeSign(n);
        System.out.println(result);
    }
}
