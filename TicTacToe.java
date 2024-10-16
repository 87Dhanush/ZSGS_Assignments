import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[3][3];
        int countX = 0;
        int countO = 0;

        System.out.println("Enter the player position (for player1 (x),player2 (o),nor player1 and player2 (-)) : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.next().charAt(0);
                if (grid[i][j] == 'x') {countX++;}
                if (grid[i][j] == 'o') {countO++;}
            }
        }

        if (countO > countX || countX - countO > 1) {
            System.out.println("Invalid: Wrong turn order");
        }

        // Check a winner
        boolean xWins = checkWinner(grid, 'x');
        boolean oWins = checkWinner(grid, 'o');

        if (xWins && oWins) {
            System.out.println("Invalid: Both players cannot win");
        }
        if (oWins && countX > countO) {
            System.out.println("Invalid: O wins but x have extra move");
        }
        if (xWins && countX == countO) {
            System.out.println("Invalid: X wins but didn't play last");
        }

        // game state
        if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (countX + countO == 9) {
            System.out.println("Draw");
        } else {
            System.out.println("Ongoing game");
        }
    }

    public static boolean checkWinner(char[][] grid, char player) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {return true;}
            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) {return true;}
        }
        // Check diagonals
        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {return true;}
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {return true;}

        return false;
    }
}
