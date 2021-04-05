package eu.senla.task12;

import eu.senla.task12.good.Good;
import eu.senla.task12.order.Order;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String mode; //режим товар/заказ
    /* Два объекта Заказ и Товар. Должно быть два файла для заказов и товаров.
    Каждый товар должен иметь id, название, дату изготовления.
    Каждый заказ должен иметь по два товара разных. Дату когда оформлялся заказ и id.
    С консоли нужно иметь возможность вводить товары,
    смотреть товары и удалять товары.
    Тоже самое с заказами.
    Использовать все что знаете.
    В файлах должно остатся изменения после окончания работы программы.
    Программа не закончит работу пока этого не захочет пользователь. */
    public static void main(String[] args) {


        try {
            //чтение файла с товарами
            File fileGoods = new File("src/eu/senla/task12/good/goods.txt");
            Scanner scanGood = new Scanner(fileGoods);
            ArrayList goodList = new ArrayList();
            while (scanGood.hasNextLine()) {
                String line = scanGood.nextLine();
                String[] str = line.split("/");
                Good good = new Good(Integer.parseInt(str[0]), str[1], getDate(str[2]));
                goodList.add(good);
            }
            System.out.println(goodList);

            //чтение файла с заказами
            File fileOrder = new File("src/eu/senla/task12/order/orders.txt");
            Scanner scanOrder = new Scanner(fileOrder);
            ArrayList orderList = new ArrayList();
            while (scanOrder.hasNextLine()){
                String line = scanOrder.nextLine();
                String[] str = line.split("/");
                Order order = new Order(Integer.parseInt(str[0]), getDate(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
                orderList.add(order);
            }
            System.out.println(orderList);

            //работа с консолью
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("С чем хотите работать? 1 - товары, 2 - заказы, 0 - завершить работу");
                mode = scan.next();
                if ("1".equals(mode)) {
                    proccesingList(goodList);
                    FileWriter fw = new FileWriter(fileGoods, false);
                    for (int i = 0; i < goodList.size(); i++) {
                        Good g = (Good) goodList.get(i);
                        String s = g.getId()+"/"+g.getName()+"/"+getDateReverse(g.getDate())+"\n";
                        fw.write(s);
                    }
                    fw.close();
                } else if ("2".equals(mode)) {
                    proccesingList(orderList);
                    FileWriter fw = new FileWriter(fileOrder, false);
                    for (int i = 0; i < orderList.size(); i++) {
                        Order o = (Order) orderList.get(i);
                        String s = o.getId()+"/"+getDateReverse(o.getDate())+"/"+o.getIdFirst()+"/"+o.getIdSecond()+"\n";
                        fw.write(s);
                    }
                    fw.close();
                } else if ("0".equals(mode)) {
                    break;
                } else {
                    break;
                }
            }
            //закрытие потоков
            scan.close();
            scanGood.close();
            scanOrder.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //метод получает дату в формате гггг-мм-дд
    private static LocalDate getDate(String date) {
        String[] split = date.split("-");
        return LocalDate.of(Integer.parseInt(split[2]), Integer.parseInt(split[1]), Integer.parseInt(split[0]));
    }

    //метод преобразовывает LocalDate в строку формата "дд-мм-гггг"
    private static String getDateReverse(LocalDate date) {
        String str = date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear();
        return str;
    }

    //метод принимает с консоли команды и обрабатывает коллекцию товаров или заказов
    private static void proccesingList(ArrayList list){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1 - смотреть элементы, 2 - добавить элемент, 3 - удалить элемент, 0 - назад");
            String num = scan.next();
            if ("1".equals(num)) {
                System.out.println("Смотреть? 1- все элементы, 2 - элемент по id, 0 - назад");
                num = scan.next();
                if ("1".equals(num)) {
                    System.out.println(list);
                } else if ("2".equals(num)) {
                    System.out.println("Введите id элемента");
                    num = scan.next();
                    if (Integer.parseInt(num) > 0 && Integer.parseInt(num) < list.size()) {
                        System.out.println(list.get(Integer.parseInt(num) - 1));
                    } else {
                        System.out.println("Введен неверный id");
                    }
                }
            } else if ("2".equals(num)) {
                if ("1".equals(mode)) {
                    System.out.println("Введите наименование товара");
                    String name = scan.next();
                    System.out.println("Введите дату производства (в формате дд-мм-гггг)");
                    String dateStr = scan.next();
                    Good good = new Good(list.size()+1, name, getDate(dateStr));
                    list.add(good);
                } else if ("2".equals(mode)) {
                    System.out.println("Введите дату заказа (в формате дд-мм-гггг)");
                    String dateStr = scan.next();
                    System.out.println("Введите id первого товара");
                    String idFirst = scan.next();
                    System.out.println("Введите id второго товара");
                    String idSecond = scan.next();
                    Order order = new Order(list.size()+1, getDate(dateStr), Integer.parseInt(idFirst), Integer.parseInt(idSecond));
                    list.add(order);
                }
            } else if ("3".equals(num)) {
                System.out.println("Введите id удаляемого элемента");
                num = scan.next();
                list.remove(Integer.parseInt(num)-1);;
            } else {
                break;
            }
        }
    }

}