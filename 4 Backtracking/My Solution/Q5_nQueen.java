/*
Q5. The n-queens puzzle is the problem of placing n queens on an n x n chessboard
such that no two queens attack each other. Given an integer n,
return the number of distinct solutions to the n-queens puzzle.

Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4 queens puzzle as shown.

Input: n = 1
Output: 1
*/


// TC O(n!)
// SC O(n^2)
import java.util.*;

public class Q5_nQueen
{
    // Method to calculate total number of distinct solutions for n-queens
    public static int totalNQueens(int n)
    {
        // Initialize the chessboard with '.'
        char [][] board = new char[n][n];
        for(char [] i : board)
        {
            Arrays.fill(i, '.');
        }
        // Start recursive backtracking to solve the problem
        return go(0, board);
    }

    // Recursive method to place queens column by column
    public static int go(int col, char[][] board)
    {
        // Base case: If all columns are filled, one solution is found
        if(col == board.length)
        {
            return 1;
        }
        int count = 0;
        // Try placing a queen in each row for the current column
        for(int row = 0; row < board.length; row++)
        {
            // Check if placing a queen at (row, col) is safe
            if(isSafe(board, row, col))
            {
                board[row][col] = 'Q'; // Place the queen
                count += go(col + 1, board); // Recursive call for the next column
                board[row][col] = '.'; // Backtrack by removing the queen
            }
        }
        return count; // Return the count of solutions for this configuration
    }

    // Method to check if it's safe to place a queen at (row, col)
    public static boolean isSafe(char [][] board, int row, int col)
    {
        int dupRow = row;
        int dupCol = col;

        // Check the upper-left diagonal
        while(row >= 0 && col >= 0)
        {
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        // Reset row and col to original position
        row = dupRow;
        col = dupCol;
        // Check the left side of the current row
        while(col >= 0)
        {
            if(board[row][col] == 'Q') return false;
            col--;
        }

        // Reset col and use row for lower-left diagonal
        col = dupCol;
        while(col >= 0 && row < board.length)
        {
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true; // Safe to place the queen
    }

    public static void main(String[] args)
    {
        int n = 4; // Input value of n
        // Print the total number of distinct solutions
        System.out.println("The desired answer is : " + totalNQueens(n));
    }
}

