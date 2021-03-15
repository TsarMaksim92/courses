package eu.senla.task8;

import eu.senla.task8.myArray.MyArrayList;

public class Main {

//прописать толковый мейн со всеми методами

    public static void main(String[] args) {

        //пустой конструктор
        MyArrayList<Integer> list1 = new MyArrayList<>();
        System.out.println("***** Пустой конструктор *****");
        System.out.println(list1.toString());

        //конструктор с заданным размером
        MyArrayList<String> list2 = new MyArrayList<>(5);
        System.out.println("\n\r ***** Конструктор с заданным размером *****");
        System.out.println(list2.toString());

        //метод add
        list2.add(3,"Task8");
        System.out.println("\n\r ***** Метод add *****");
        System.out.println(list2.toString());

        //метод addAll
        MyArrayList<String> list3 = new MyArrayList<>();
        list3.add(0,"List3");
        list3.add(1,"List3");
        list2.addAll(2, list3);
        System.out.println("\n\r ***** Метод addAll *****");
        System.out.println(list2.toString());

        //метод get
        System.out.println("\n\r ***** Метод get *****");
        System.out.println(list2.get(3));

        //метод indexOf
        System.out.println("\n\r ***** Метод indexOf *****");
        System.out.println(list2.indexOf("Task8"));
        System.out.println(list2.indexOf("Task")); //проверка на возврат -1

        //метод lastIndexOf
        System.out.println("\n\r ***** Метод lastIndexOf *****");
        System.out.println(list3.lastIndexOf("List3"));
        System.out.println(list3.lastIndexOf("List")); //проверка на возврат -1

        //метод remove
        System.out.println("\n\r ***** Метод remove *****");
        System.out.println(list2.remove(3));

        //метод set
        System.out.println("\n\r ***** Метод set *****");
        System.out.println(list2.set(2, "set"));

        //метод subList
        System.out.println("\n\r ***** Метод subList *****");
        System.out.println(list2.subList(2, 4));
    }
}

