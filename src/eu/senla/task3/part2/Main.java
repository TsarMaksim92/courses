package eu.senla.task3.part2;

/*
Сгенерировать метод equals и toString для класса Cat.
 */

public class Main {
    public static void main(String[] args) {
        //два первых объекта по дефолту, трейтий для проверки equals
        Cat catFirst = new Cat();

        Cat catSecond= new Cat();

        Cat catThird= new Cat();
        catThird.setNickname("Barsik");
        catThird.setAge(3);

        //вывод в консоль имени и возраста (для наглядности)
        System.out.println("Первый кот (дефолт) - " + catFirst.getNickname() + " " + catFirst.getAge());
        System.out.println("Второй кот (дефолт) - " + catSecond.getNickname() + " " + catSecond.getAge());
        System.out.println("Трейтий кот - " + catThird.getNickname() + " " + catThird.getAge());

        System.out.println("toString от Idea - " + catFirst.toString());
        System.out.println("toString самописаное - " + catFirst.toStringNew());

        System.out.println("Сравнение первого и второго (заведомо одинаковые-дефолтные) котов - " + catFirst.equals(catSecond));
        System.out.println("Сравнение второго(дефолтного) и третьего котов - " + catSecond.equals(catThird));
    }
}

