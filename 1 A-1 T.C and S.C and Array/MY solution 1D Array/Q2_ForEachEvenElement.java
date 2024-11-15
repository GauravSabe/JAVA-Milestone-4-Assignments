/*
 * Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 34 54

    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 4 6
 */


import java.util.Scanner;

public class Q2_ForEachEvenElement
{
    //Print Each Even Element
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        //Approach - 1
        //T.C = O(n)
        //S.C = O(1)

        int [] arr = {3,20,4,6,9};
        System.out.print("Even Elements Present in an array : ");
        for(int element : arr)
        {
            if(element % 2 == 0)
            {
                System.out.print(element + " ");
            }
        }

        //Approach - 2
        // T.C = O(n)
        // S.C = O(1)

        System.out.println("\nEnter the size of the array: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n1; i++)
        {
            int element = sc.nextInt();
            if (element % 2 == 0)
            {
                System.out.print(element + " ");
            }
        }
    }
}