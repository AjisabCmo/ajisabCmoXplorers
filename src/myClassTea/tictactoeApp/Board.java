package myClassTea.tictactoeApp;

import java.util.Arrays;

public class Board {
    private final CellValue [][] cellValues;

    public Board() {
        cellValues = new CellValue[3][3];
        for (CellValue[] cellValue : cellValues) {
            Arrays.fill(cellValue, CellValue.EMPTY);
        }
    }

    public CellValue[][] getCellValues() {
        return cellValues;
    }
}
