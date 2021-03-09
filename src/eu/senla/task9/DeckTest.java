package eu.senla.task9;

import eu.senla.task5.Deck;
import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class DeckTest {

    Deck deck = new Deck(2);
    Container cont = new Square(2);

    @Test
    public void setNumberofContainerTest() {
        Assertions.assertEquals(2,deck.setNumberOfContainers(2));
        Assertions.assertEquals(4,deck.setNumberOfContainers(4));
        Assertions.assertEquals(0,deck.setNumberOfContainers(3));
        Assertions.assertEquals(0,deck.setNumberOfContainers(0));
    }

    @Test
    public void addTestDeck(){
        Assertions.assertEquals(true,deck.add(cont));
        Assertions.assertEquals(true,deck.add(cont));
        Assertions.assertEquals(false,deck.add(cont));
    }

    @Test
    public void getMassTest(){
        Container contMock = Mockito.mock(Square.class);
        when(contMock.getMass()).thenReturn(100);
        deck.add(contMock);
        deck.add(contMock);
        Assertions.assertEquals(200,deck.calculationMass());
    }
}
