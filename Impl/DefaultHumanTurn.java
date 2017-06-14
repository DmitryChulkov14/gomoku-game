package net.jurinson.Impl;

import net.jurinson.Cell;
import net.jurinson.CellValue;
import net.jurinson.GameTable;
import net.jurinson.HumanTurn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class DefaultHumanTurn implements HumanTurn {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultHumanTurn.class);
    private GameTable gameTable;

    @Override
    public void setGameTable(GameTable gameTable) {
        Objects.requireNonNull(gameTable, "Game table can't be null");
        this.gameTable = gameTable;
    }

    @Override
    public Cell makeTurn(int row, int col) {
        gameTable.setValue(row, col, CellValue.HUMAN);
        Cell cell = new Cell(row, col);
        LOGGER.info("Human turn is {}", cell);
        return cell;
    }
}
