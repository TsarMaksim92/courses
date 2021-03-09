package eu.senla.task9;

import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void getDiagonaдIfSize0 () {
        Container contSquareSize0 = new Square(0);
        Assertions.assertEquals(0,contSquareSize0.getDiagonal());
    }

    @Test
    public void getDiagonaдIfSize1 () {
        Container contSquareSize1 = new Square(1);
        Assertions.assertEquals(10, contSquareSize1.getDiagonal());
    }

    @Test
    public void getDiagonaдIfSize2 () {
        Container contSquareSize2 = new Square(2);
        Assertions.assertEquals(20, contSquareSize2.getDiagonal());
    }

    @Test
    public void getDiagonaдIfSize3 () {
        Container contSquareSize3 = new Square(3);
        Assertions.assertEquals(0,contSquareSize3.getDiagonal());
    }

    @Test
    public void getMassDefaultContainerSize1 () {
        Container contSquareDefault = new Square(1);
        Assertions.assertEquals(500000,contSquareDefault.getMass());
    }

    @Test
    public void getMassDefaultContainerSize2 () {
        Container contSquareDefault = new Square(2);
        Assertions.assertEquals(2000000,contSquareDefault.getMass());
    }


}
