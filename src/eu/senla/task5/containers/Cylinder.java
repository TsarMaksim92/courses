package eu.senla.task5.containers;

public class Cylinder extends Container {

    public Cylinder(int size) {
        super(size);
        this.mass = getMass();
    }

    //возращает массу воды в контейнере
    public int getMass () {
        mass = (int) (Math.PI * (Math.pow(this.diagonal/2, 2)) * this.height*this.density);
        return mass;
    }
}
