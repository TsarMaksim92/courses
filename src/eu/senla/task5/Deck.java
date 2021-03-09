package eu.senla.task5;

import eu.senla.task5.containers.*;

public class Deck {
    Container[] containers;
    private int count = 0;

    public Deck (int number) { //количество контейнеров на палубе 2 или 4
        containers = new Container[setNumberOfContainers(number)];
    }


    public int setNumberOfContainers(int number) {
        if (number == 2 || number ==4) {
            return number;
        } else {
            return 0;
        }
    }

    //метод добавляет сонтейнер на палубу
    public boolean add (Container container) {
        if (count < containers.length) {
            containers[count] = container;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public int calculationMass() {
        int mass = 0;
        for (Container cont : containers) {
            mass += cont.getMass();
        }
        return mass;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Container cont : containers) {
            sb.append(cont.toString()+"; ");
        }
        sb.setLength(sb.length()-2);
        sb.append("]");
        return sb.toString();
    }
}
