package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.D4, Cell.F6);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D6));
        logic.add(new PawnBlack(Cell.C5));
        logic.move(Cell.D6, Cell.A3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void  whenImpossibleMoveException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.move(Cell.F8, Cell.F5);
    }

}