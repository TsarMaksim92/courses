package eu.senla.task7.version1.robot;

import eu.senla.task7.version1.factory.FactoryBody;
import eu.senla.task7.version1.factory.FactoryHead;

public class Robot {
    FactoryBody body;
    FactoryHead head;
    Name name;

    public Robot (int index) {
        Name[] names = Name.values();
        this.name = names[index];
        this.head = new FactoryHead();
        this.body = new FactoryBody();
    }

    @Override
    public String toString() {
        return  "Имя = " + name + ", " +
                body + ", " +
                head;
    }
}
