package eu.senla.task9;

import eu.senla.task5.Port;
import eu.senla.task5.Ship;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PortTest {

    Ship ship = new Ship(1);
    Port port = new Port(2);

    @Test
    public void addTestShip(){
        Assertions.assertEquals(true,port.add(ship));
        Assertions.assertEquals(true,port.add(ship));
        Assertions.assertEquals(false,port.add(ship));
    }
}
