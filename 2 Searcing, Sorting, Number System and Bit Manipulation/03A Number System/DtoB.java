/**
 * Problem 1: given a Decimal number, print its binary representation. [easy]

 Input 1: number = 5
Output 1: 101

Input 2: number = 10
Output 2: 1010

 */
public class DtoB 
{

    public static void main(String[] args) 
    {
        //Approach - 1        
        int num = 16;
        if (num == 0)
        {
            System.out.println("0");
        }
        StringBuilder str = new StringBuilder();
        while (num > 0) 
        {
            int r = num % 2;
            // str += r + " "; 
            str.append(r).append(" ");
            num /= 2;        
        }
        str.reverse();
        System.out.println("Binary representation of given number is: " + str);

        //Approach - 2
        int number1 = 5;
        int number2 = 10;
        System.out.println("Binary representation of " + number1 + " is: " + Integer.toBinaryString(number1));
        System.out.println("Binary representation of " + number2 + " is: " + Integer.toBinaryString(number2));
    }
}