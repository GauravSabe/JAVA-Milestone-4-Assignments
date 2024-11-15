import java.util.Scanner;

/**
 * Q4. Given a number, count the number of set bits in that number without using an extra space.
 
 Note : bit ‘1’ is also known as set bit.
 */
public class CountNumSetBits 
{
    //A - 1
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    //A - 2
    public static int countSetBits_1(int n) {
        int count = 0;
        while (n > 0)
        {
            n &= (n - 1); // Remove the lowest set bit
            count++; // Increment count for each set bit found
        }
        return count;
    }


    public static void main(String[] args) 
    {
         // Create Scanner object
         Scanner s = new Scanner(System.in);
         
         int number;
		 System.out.println("Enter the integer: ");
 
        // Read the next integer from the screen
        number = s.nextInt();

        //A - 1
        int answer = countSetBits(number);
        System.out.println("The number of set bits in the given number are " + answer);

        //A - 2
        int answer1 = countSetBits_1(number);
        System.out.println("The number of set bits in the given number are " + answer1);
	}
}