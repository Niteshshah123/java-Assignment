import java.util.Scanner;

public class connect4game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create players
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');

        // Initialize game
        Board board = new Board();
        Game game = new Game(player1, player2, board);

        // Start the game
        game.startGame(scanner);
    }
}

class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

class Board {
    public static final int ROWS = 6;
    public static final int COLS = 7;
    private char[][] grid;

    public Board() {
        grid = new char[ROWS][COLS];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print("| " + grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("----------------------------");
    }

    public boolean isColumnFull(int column) {
        return grid[0][column] != ' ';
    }

    public boolean isValidMove(int column) {
        return column >= 0 && column < COLS && !isColumnFull(column);
    }

    public void dropPiece(int column, char symbol) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (grid[i][column] == ' ') {
                grid[i][column] = symbol;
                break;
            }
        }
    }

    public boolean checkWin(char symbol) {
        // Check for a win
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // Check horizontally
                if (j + 3 < COLS &&
                        grid[i][j] == symbol &&
                        grid[i][j + 1] == symbol &&
                        grid[i][j + 2] == symbol &&
                        grid[i][j + 3] == symbol) {
                    return true;
                }

                // Check vertically
                if (i + 3 < ROWS &&
                        grid[i][j] == symbol &&
                        grid[i + 1][j] == symbol &&
                        grid[i + 2][j] == symbol &&
                        grid[i + 3][j] == symbol) {
                    return true;
                }

                // Check diagonally (down-right)
                if (i + 3 < ROWS && j + 3 < COLS &&
                        grid[i][j] == symbol &&
                        grid[i + 1][j + 1] == symbol &&
                        grid[i + 2][j + 2] == symbol &&
                        grid[i + 3][j + 3] == symbol) {
                    return true;
                }

                // Check diagonally (up-right)
                if (i - 3 >= 0 && j + 3 < COLS &&
                        grid[i][j] == symbol &&
                        grid[i - 1][j + 1] == symbol &&
                        grid[i - 2][j + 2] == symbol &&
                        grid[i - 3][j + 3] == symbol) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < COLS; i++) {
            if (!isColumnFull(i)) {
                return false;
            }
        }
        return true;
    }
}

class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = board;
    }

    public void startGame(Scanner scanner) {
        System.out.println("Welcome to Connect 4!");

        while (true) {
            board.printBoard();

            int move;
            do {
                System.out.print(currentPlayer.getName() + ", enter column (0-6): ");
                move = scanner.nextInt();
            } while (!board.isValidMove(move));

            board.dropPiece(move, currentPlayer.getSymbol());

            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        System.out.println("Thanks for playing!");
    }
}
