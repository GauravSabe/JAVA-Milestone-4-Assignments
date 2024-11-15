/*
 * Q5. Given a number n. Print if it is an armstrong number or not.
    An armstrong number is a number if the sum of every digit in that number
    raised to the power of total digits in that number is equal to the number.
    *
 Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number.(Easy)

Input1 : 153
Output1 : Yes

Input 2 : 134
Output2 : No

*/

// TC = O(n)
// SC = O(n)
import java.util.Scanner;

public class ArmstrongNum 
{
    public static int arm(int n)
    {
        if(n<10)
        {
            return n*n*n;
        }
        else
        {
            return ((n%10)*(n%10)*(n%10) + arm(n/10)); // '%10' ---> give last element ---> '/10' ---> removed last element
        }     
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = arm(n);

        if(result == n)
        {
            System.out.println("it's armstrong number");
        }
        else
        {
            System.out.println("it's not a armstrong number");
        }
    }
}
