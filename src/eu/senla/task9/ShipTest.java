package eu.senla.task9;


import eu.senla.task5.Deck;
import eu.senla.task5.Ship;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class ShipTest {

    Deck deck = new Deck(2);
    Ship ship = new Ship(2);

    @Test
    public void setNumberofContainerTest() {
        Assertions.assertEquals(1,ship.setNumberOfDecks(1));
        Assertions.assertEquals(2,ship.setNumberOfDecks(2));
        Assertions.assertEquals(0,ship.setNumberOfDecks(0));
        Assertions.assertEquals(0,ship.setNumberOfDecks(3));
    }

    @Test
    public void addTestDeck(){
        Assertions.assertEquals(true,ship.add(deck));
        Assertions.assertEquals(true,ship.add(deck));
        Assertions.assertEquals(false,ship.add(deck));
    }

    @Test
    public void getMassTest(){
        Deck deckMock = Mockito.mock(Deck.class);
        when(deckMock.calculationMass()).thenReturn(100);
        ship.add(deckMock);
        ship.add(deckMock);
        Assertions.assertEquals(200,ship.getMass());
    }
}
