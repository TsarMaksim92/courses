package eu.senla.task5;

import eu.senla.task5.containers.*;

/*
    Построить иерархию. Порт 10 кораблей. В порт приплывают корабли (однопалубные и двухпалубные),
    на одну палубу помещается или 2 больших контейнера или 4 маленьких.
    Контейнеры могут быть разной формы (цилиндрические, квадратные, конусом).
    Контейнеры наполнены водой (с плотностью 1000 и 2000 единиц, т.е. можно наливать разную воду, плотность константа).
    Нужно что бы мы могли в порт пригонять разные корабли, с разными контейнерами, с разной водой.
    С разной высотой контейнеров: не больше 100 единиц и не меньше 10.
    И основание конуса и цилинда диагональ 20 у большого и 10 у маленького.
    И у квадратного с диагональю 20 у большого и 10 у маленького квадрата.
    И выводить массу воды которую привозят корабли.

    Не забываем про пакеты с маленькой буквы.
    Объекты одного типа в один пакет.
    Не все делаем public.
    Можно использовать массивы.
     */
public class Main {
    // лень придумывать! всё рандомно (в пределах условий задания)
    public static void main(String[] args) {
        Port port = new Port(10); //создаем порт с 10 кораблями
        Ship ship;
        Deck deck;
        Container container;
        //цикл заполняет порт кораблями
        do {
            ship = new Ship((int) (Math.random()*2) + 1); //рандомное количество палуб на корабле
            //цикл заполняет корабль палубами
            do {
                deck = new Deck(((int) (Math.random()*2) + 1)*2); //рандомное количество контейнеров на палубе (2 больших или 4 маленьких)
                // устанавливаем размер контейнеров
                int sizeContainer = 0;
                if (deck.containers.length == 2) { //если 2 контейнера, то большие
                    sizeContainer = 2;
                } else if (deck.containers.length == 4) { //если 4 контейнера, то маленькие
                    sizeContainer = 1;
                }
                //цикл заполняет палубу рандомными контейнерами с рандомными свойствами
                do {
                    int randomNumber = (int) (Math.random()*3);
                    switch (randomNumber) {
                        case 0:
                            container = new Square(sizeContainer);
                            break;
                        case 1:
                            container = new Cylinder(sizeContainer);
                            break;
                        case 2:
                            container = new Cone(sizeContainer);
                            break;
                        default:
                            container = new Square(sizeContainer); //дефолтные контейнеры - квадратные
                            break;
                    }
                } while (deck.add(container));
            } while (ship.add(deck));
        } while (port.add(ship));
        System.out.println(port.toString());
    }
}
