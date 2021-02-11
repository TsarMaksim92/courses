package eu.senla.task5;

public class Port{
    Ship[] ships;
    private int count = 0;

    public Port (int number) { //количество кораблей
        ships = new Ship[number];
    }

    //метод добаляет корабль в порт
    public boolean add(Ship ship) {
        if (count < ships.length) {
            ships[count] = ship;
            count++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ships.length; i++) {
            sb.append("Ship " + (i+1) + " ");
            sb.append(ships[i].toString()+"; ");
            sb.append("\n\r");
        }
        sb.setLength(sb.length()-2);
        return sb.toString();
    }

}
