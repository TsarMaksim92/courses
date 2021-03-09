package eu.senla.task5.containers;

public abstract class Container implements ContainerImpl {
    public int size;
    int diagonal;
    int height;
    int density;
    int mass;

    public Container(int size) { //дефолный контейнер высота - 10, плотность - 1000
        this.size = size;
        this.diagonal = getDiagonal();
        this.height = 10;
        this.density = 1000;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 10 && height<=100) {
            this.height = height;
        } else {
            System.out.println("Incorrect value height! (10...100)");
        }
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        if (density == 1000 || density ==2000) {
            this.density = density;
        } else {
            System.out.println("Incorrect value density! (1000 or 2000)");
        }
    }

    public abstract int getMass(); //возращает массу воды в контейнере

    //рандомно возвращает диагональ (10 для маленького(size = 1) и 20 для большого(size = 2))
    public int getDiagonal() {
        if (this.size == 1) {
            diagonal = 10;
        } else if (this.size == 2) {
            diagonal = 20;
        } else {
            return 0;
        }
        return diagonal;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass());
        sb.delete(0, sb.toString().lastIndexOf('.')+1);//получаем класс контейнера
        // получаем размер контейнера
        if (this.size == 1) {
            sb.append("- size=small");
        } else if (this.size == 2) {
            sb.append("- size=big");
        }
        return sb.append(", diagonal=" + diagonal +
                ", height=" + height +
                ", density=" + density +
                ", mass=" + mass).toString();
    }
}

