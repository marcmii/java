package Tasca2_Metodes3;

import java.util.Scanner;

public class Metodes3_3 {

    private static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        match();
    }
    
    public static void board() {
        System.out.println("    0  1  2");
        System.out.println("   ----------");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + i + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n   ----------");
        }
    }

    public static void match() {
        Scanner in = new Scanner(System.in);
        int move = 0;
        boolean ticTacToe = false;

        while (!ticTacToe) {
            board();
            if (move % 2 == 0) {
                System.out.println("Entra una fila pel jugador X: ");
            } else {
                System.out.println("Entra una fila pel jugador O: ");
            }
            int row = in.nextInt();
            System.out.println("Entra una columna pel jugador " + (move % 2 == 0 ? "X" : "O") + ": ");
            int column = in.nextInt();

            if (row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ') {
                board[row][column] = (move % 2 == 0) ? 'X' : 'O';
                move++;

                // Verificar si hay un ganador
                if (checkWinner()) {
                    board();
                    System.out.println("El jugador " + (move % 2 == 0 ? "O" : "X") + " ha guanyat!");
                    ticTacToe = true;
                } else if (move == 9) {
                    board();
                    System.out.println("La partida acaba en empat.");
                    ticTacToe = true;
                }
            } else {
                System.out.println("Mou no vàlid, prova de nou.");
            }
        }
        in.close();
    }

    public static boolean checkWinner() {
        // Comprobar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') ||
                (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ')) {
                return true;
            }
        }
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
            (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
            return true;
        }
        return false;
    }
}
