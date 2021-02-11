package eu.senla.task5.containers;

public abstract class Container implements ContainerImpl {
    public int size;
    int diagonal;
    int height;
    int density;
    int mass;

    public Container(int size) {
        this.size = size;
        this.diagonal = getDiagonal();
        this.height = getHeight();
        this.density = getDensity();
    }

    public abstract int getMass(); //возращает массу воды в контейнере

    //рандомно возвращает диагональ (10 для маленького(size = 1) и 20 для большого(size = 2))
    public int getDiagonal() {
        if (this.size == 1) {
            diagonal = 10;
        } else if (this.size == 2) {
            diagonal = 20;
        }
        return diagonal;
    }

    //рандомно возвращает высоту контейнера (от 10 до 100)
    public int getHeight() {
        height = (int) (10 + Math.random()*90);
        return height;
    }

    //рандомно возвращает плотность воды (1000 или 2000)
    public int getDensity() {
        if ((int) (Math.random()*2) == 0) {
            density = 1000;
        } else {
            density = 2000;
        }
        return density;
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

