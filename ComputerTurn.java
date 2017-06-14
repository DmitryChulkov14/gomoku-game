package net.jurinson;

public interface ComputerTurn {
    void setGameTable(GameTable gameTable);

    Cell makeFirstTurn();

    Cell makeTurn();
}
