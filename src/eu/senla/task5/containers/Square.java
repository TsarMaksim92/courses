package eu.senla.task5.containers;

public class Square extends Container {

    public Square(int size) {
        super(size);
        this.mass = getMass();
    }

    //возращает массу воды в контейнере
    public int getMass() {
        mass = (int) (Math.pow(diagonal, 2) / 2 * this.height * this.density);
        return mass;
    }
}
