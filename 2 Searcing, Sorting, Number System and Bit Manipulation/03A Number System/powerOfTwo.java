/*
 * Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]

Input1:n=15
Output 1: False

Input2:n=32
Output 2: True

 */

import java.util.Scanner;

public class powerOfTwo 
{
        //Approach - 1
        public static boolean isPowerOfTwo(int n) 
        {
            if (n <= 0) 
            {
                return false;
            }
            return (n & (n - 1)) == 0;
        }

        //Approach - 2
        public static boolean isPowerOfTwo_1(int n)
        {
            while (n % 2 == 0) {
                n /= 2;
            }
            return n == 1;
        }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        //Approach - 1
        System.out.println(isPowerOfTwo(num));

        //Approach - 2
        System.out.println(isPowerOfTwo_1(num));


    }
}
