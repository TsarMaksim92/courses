package eu.senla.task4;

/*
+1. Создать матрицу состоящую из строк 10х10. Заполнить её (1  шт дабл 0 6 симоволов, 2 шт стринг 6 симоволов).
2. Взять её прямую и побочную диогональ, сравнить их, являются ли они одинаковыми.
(Строки в виде чисел выводить как дабл. После положить элементы диагоналей в массив.
Определить символы и числа в массиве.
Провести все необходимые преобразования.
Про преобразования почитать. String.valueOf(), Double.parseDouble().
3. Если элемент является строкой, то взять из неё со 2 по 4 элемент и положить в SB и просто вывести на экран через запятую.
4. Если же числом, то нужно округлить каждое число. Если 1,7 и больше то в большую сторону, если меньше то в меньшую сторону).
После положить числа в массив и этот массив вывести на экран через знак подчеркивание.
5. Также вывести на экран первоначальную матрицу.
 */

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        String[][] array = helper.matrix(10,10);
        System.out.println("п.2 задания\n\rДиагонали равны? - " + helper.compareDiagonal(helper.getMainDiagonal(array), helper.getSideDiagonal(array)));
        String[] str = helper.getGeneralArray(helper.getMainDiagonal(array), helper.getSideDiagonal(array));
        System.out.println("п.3 задания\n\r" + helper.getString(str));
        System.out.println("п.4 задания\n\r" + helper.getStringNumber(str));
        System.out.println("п.5 задания");
        helper.printMatrix(array);

    }
}
