package eu.senla.task7.version1.factory;

import eu.senla.task7.version1.part.Head;

public class FactoryHead implements Factory{

    public FactoryHead () {
        this.getPart().toString();
    }

    public Head getPart () {
        Head[] heads = Head.values();
        int index = (int) (Math.random()*3);
        return heads[index];
    }
    public String toString () {
        return "Голова = " + this.getPart();
    }
}

