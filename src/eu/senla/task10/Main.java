package eu.senla.task10;

import eu.senla.task10.myArray.MyArrayList;
import eu.senla.task10.myArray.MyList;

public class Main {
    /*
    1. Написать три своих исключения.
    2. Каждое должно логически срабатывать при определенных условиях.
    3. Конструкции с исключениями должны включать try / catch / finally.
    4. Два из трех могут быть объединенные.
    5. Третье в отдельном методе и пробрасывается, т.е. ловится выше.

    Самим придумать почему исключения срабатывает.
    Ничего не мудрить, все должно быть просто.
    */
    public static void main(String[] args) throws Exception {
        MyList<String> list = new MyArrayList<>();
        list.add(0,"string0");
        list.add(1,"string1");
        list.add(2,"string2");
        list.add(3,"string3");

        try {
            list.get(-8);
            //list.get(88);
        } catch (NewIndexOutOfBoundsException | NewNegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(list);
        }

        try {
            list.set(1, "stringstring");
        } catch (NewExceedingNumberOfCharacters ee) {
            System.out.println(ee.getMessage());
        } finally {
            System.out.println(list);
        }
    }
}
