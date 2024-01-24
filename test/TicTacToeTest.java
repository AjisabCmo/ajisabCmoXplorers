
import myClassTea.tictactoeApp.Board;
import myClassTea.tictactoeApp.CellValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    @Test
    public void testThatTheGameBoardShouldStartEmpty(){
        Board board = new Board();
        for(int row = 0 ; row < 3; row++){
            for (int column = 0 ; column < 3;column++){
                assertEquals(board.getCellValues()[row][column], CellValue.EMPTY);
            }
        }
    }
}
