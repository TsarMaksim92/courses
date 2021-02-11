package eu.senla.task5;

public class Ship {
    Deck[] decks;
    private int count = 0;

    public Ship (int number) { //number 1 или 2 палубы
        decks = new Deck[number];
    }

    //метод добавляет палубу на корабль
    public boolean add (Deck deck) {
        if (count<decks.length) {
            decks[count] = deck;
            count++;
            return true;
        } else {
            return false;
        }
    }

    private int getMass () {
        int mass = 0;
        for (Deck deck : decks) {
            mass += deck.getMass();
        }
        return mass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < decks.length; i++) {
            sb.append("Deck " + (i+1) + " ");
            sb.append(decks[i].toString()+"; ");
        }
        sb.setLength(sb.length()-2);
        sb.append("]\n\r");
        sb.append("Weight of transported water = " + this.getMass());
        return sb.toString();
    }
}
