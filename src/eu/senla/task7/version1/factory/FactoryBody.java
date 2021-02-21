package eu.senla.task7.version1.factory;

import eu.senla.task7.version1.part.Body;

public class FactoryBody implements Factory{

    public FactoryBody () {
        this.getPart().toString();
    }

    public Body getPart () {
        Body[] bodies = Body.values();
        int index = (int) (Math.random()*3);
        return bodies[index];
    }

    public String toString () {
        return "Тело = " + this.getPart();
    }
}
