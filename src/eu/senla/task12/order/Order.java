package eu.senla.task12.order;

import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate date;
    private int idFirst;
    private int idSecond;

    public Order(int id, LocalDate date, int idGood1, int idGood2) {
        this.id = id;
        this.date = date;
        this.idFirst = idGood1;
        this.idSecond = idGood2;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", idGood1=" + idFirst +
                ", idGood2=" + idSecond +
                '}';
    }
}
