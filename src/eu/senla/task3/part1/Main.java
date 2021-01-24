package eu.senla.task3.part1;

/*
Создать два класса.
Класс Cat и класс для запуска приложения.
У кота есть имя и возраст.
Есть дефолтное значение имени и возраста.
часть 1. Цикл while создает 10 котиков и выводит имя и возраст.
часть 2. Цикл for создаем 10 котиков, вводим им возраст и имя через геттер-сеттер и выводим на консоль.
часть 3. Цикл do while создает 10 котиков вводит имя и возраст через конструктор. Выводим на консоль.
часть 4. Цикл foreach. Массив из пяти котиков, у них выводим имя и возраст.
 */

public class Main {

    static String name;
    static String[][] arrayCat = { {"Bakster", "4"},
            {"Myrzik","7"},
            {"Barsik", "3"},
            {"Mysia", "6"},
            {"Kyzia", "1"}};

    public static void main(String[] args) {
        int index =0;

        //part1 Цикл while создает 10 котиков и выводит имя и возраст.
        Cat[] cat = new Cat[10];
        while (index<10){
            cat[index] = new Cat();
            System.out.println("Nickname cat - " + cat[index].getNickname() + ", age cat - " + cat[index].getAge());
            ++index;
        }

        //part2 Цикл for создаем 10 котиков, вводим им возраст и имя через геттер-сеттер и выводим на консоль.
        Cat[] cat2 = new Cat[10];
        for (int i = 0; i < 10; ++i) {
            cat2[i] = new Cat();
            cat2[i].setNickname("nickname" + i);
            cat2[i].setAge(i);
            System.out.println("Nickname cat - " + cat2[i].getNickname() + ", age cat - " + cat2[i].getAge());
        }

        //part3 Цикл do while создает 10 котиков вводит имя и возраст через конструктор. Выводим на консоль.
        index = 0;
        do {
            String name2 = "nickname" + index;
            name = "nickname" + index;
            Cat name = new Cat(name2, index);
            System.out.println("Nickname cat - " + name.getNickname() + ", age cat - " + name.getAge());
        } while (++index <10);

        // part4 Цикл foreach. Массив из пяти котиков, у них выводим имя и возраст.
        // Решение через построчный перебор двумерного массива.
        for (String[] line : arrayCat) {
            for (String catTemp : line) {
                try {
                    int temp = Integer.parseInt(catTemp);
                } catch(NumberFormatException nfe) {
                    System.out.print("Nickname cat - " + catTemp);
                    continue;
                }
                System.out.println(", age cat - " + catTemp);
            }

        }

    }
}

