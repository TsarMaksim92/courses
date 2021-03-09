package eu.senla.task9;

import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Cone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConeTest {

//    Здесь тестируется только метод getMass, т.к. отсальные мотоды из абстрактного класса Container проверяются в классе SquareTest
    @Test
    public void getMassDefaultContainerSize1 () {
        Container contSquareDefaultSize1 = new Cone(1);
        Assertions.assertEquals(261000,contSquareDefaultSize1.getMass());
    }

    @Test
    public void getMassDefaultContainerSize2 () {
        Container contSquareDefaultSize2 = new Cone(2);
        Assertions.assertEquals(1047000,contSquareDefaultSize2.getMass());
    }
}
