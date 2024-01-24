package myClassTea.tictactoeApp;

import static java.math.BigInteger.TWO;
import static java.math.BigInteger.ZERO;

public class TicTacToe {
    private final Player[] players = new Player[TWO.intValue()];
    private Board board;
    private boolean start;


    public TicTacToe(Player[] players){
        if (players.length == 2) {
            board = new Board();
            System.arraycopy(players, ZERO.intValue(), this.players, ZERO.intValue(), players.length);
        }
        else throw new RuntimeException("Hey There, 2 People Are Required To Play This Game");
    }

    public void unableToPlay() {
        if (start == false) {
            System.out.println("Please wait the game will soon come up");
        }
    }

    public void startToPlay() {
        if (start == true) {
            board.getCellValues();
        }
    }

    public void play(Player player, int position) {
        switch (position) {
            case 1 -> board.getCellValues()[0][0] = player.getValue();
            case 2 -> board.getCellValues()[0][1] = player.getValue();
            case 3 -> board.getCellValues()[0][2] = player.getValue();
            case 4 -> board.getCellValues()[1][0] = player.getValue();
            case 5 -> board.getCellValues()[1][1] = player.getValue();
            case 6 -> board.getCellValues()[1][2] = player.getValue();
            case 7 -> board.getCellValues()[2][0] = player.getValue();
            case 8 -> board.getCellValues()[2][1] = player.getValue();
            case 9 -> board.getCellValues()[2][2] = player.getValue();
            default -> throw new RuntimeException("Please Enter A Number Between 1 and 9!!!");
        }
    }

    public Board getBoard() {
        return board;
    }
}
