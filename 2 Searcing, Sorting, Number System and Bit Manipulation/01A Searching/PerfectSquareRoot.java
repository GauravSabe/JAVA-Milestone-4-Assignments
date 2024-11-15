/*
 * Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
    A perfect square is an integer that is the square of an integer. 
    In other words, it is the product of some integer with itself.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer

 */

import java.util.Scanner;

public class PerfectSquareRoot 
{
    public static boolean perfectSquareRoot(int target)
    {
        if (target < 0) 
        {
            return false;
        }
        int low = 1;
        int high = target;

        while (low <= high) 
        {
            int mid = low + (high - low)/2;
            long val = (long) mid * mid;

            if(val == target)
            {
                return true;

            }
            else if(val > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find out it's perfect square or not: ");
        int target = sc.nextInt();

        boolean result = perfectSquareRoot(target);
        System.out.println(target + " is a perfect square : " + result);
    }
}
