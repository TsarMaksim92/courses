package eu.senla.task9;

import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Cylinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CylinderTest {

    //    Здесь тестируется только метод getMass, т.к. отсальные мотоды из абстрактного класса Container проверяются в классе SquareTest
    @Test
    public void getMassDefaultContainerSize1 () {
        Container contSquareDefaultSize1 = new Cylinder(1);
        Assertions.assertEquals(785398,contSquareDefaultSize1.getMass());
    }

    @Test
    public void getMassDefaultContainerSize2 () {
        Container contSquareDefaultSize2 = new Cylinder(2);
        Assertions.assertEquals(3141592,contSquareDefaultSize2.getMass());
    }
}
