package net.jurinson;

import java.util.List;

public interface WinnerResult {
    boolean winnerExists();

    List<Cell> getWinnerCells();
}
