package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {

    @Test
    public void bishopBlackPositionC8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void bishopBlackCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure tmp = bishopBlack.copy(Cell.B7);
        assertThat(tmp.position(), is(Cell.B7));

    }

    @Test
    public void bishopBlackWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(bishopBlack.way(Cell.G5)));
    }
}