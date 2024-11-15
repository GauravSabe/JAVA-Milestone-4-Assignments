/*
 * Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.

Input 8 --> Even
Input 3 --> False


 */

import java.util.*;

public class EvenOddUBM 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if((num & 1) == 1 )
        {
            System.out.println(num + " is odd.");
        }
        else
        {
            System.out.println(num + " is Even.");
        }
    }
}
