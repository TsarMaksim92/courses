package eu.senla.task12.good;

import java.time.LocalDate;

public class Good {
    private int id;
    private String name;
    private LocalDate date;

    public Good(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
