package eu.senla.task5;

import java.sql.SQLOutput;

public class Port{
    Ship[] ships;
    private int count = 0;

    public Port (int number) { //количество кораблей
        ships = new Ship[number];
    }

    //метод добаляет корабль в порт
    public boolean add(Ship ship) {
        if (count < ships.length && ships[count] == null) {
            ships[count] = ship;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public void remove(int index) {
        if (ships[index] != null) {
            System.out.println("The Ship " + (index+1) + " departed");
            ships[index] = null;
            count = 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] != null) {
                sb.append("Ship " + (i+1) + " ");
                sb.append(ships[i].toString()+"; ");
                sb.append("\n\r");
            } else {
                sb.append("Pier empty; \n\r");
            }
        }
        sb.setLength(sb.length()-2);
        return sb.toString();
    }

}
