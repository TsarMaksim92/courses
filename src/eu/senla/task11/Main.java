package eu.senla.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*
    +Создаем объект процессор (CPU).
    +У него есть название модели(model), тактовая частота(frequency)
    +Создать коллекцию в которую поместить 10 разных процессоров.
    +Выполнить над коллекцией все методы которые написаны в презентации.
    +Для вывода использовать любые терминальные методы.
    +Результат работы каждого метода вывести на экран, так как мы делали.
    Задание просто практика.
    +Конечно для сортировки использовать компаратор (отсортировать по частоте)
    */

    public static void main(String[] args) {

        //создаем коллекцию из файла с перечнем процессоров и её выводим
        String path = "C:\\Users\\maxim\\IdeaProjects\\courses\\src\\eu\\senla\\task11\\CPU";
        List<CPU> listCPU = null;
        try {
            listCPU = Files.lines(Paths.get(path))
                    .map(s -> s.split(", "))
                    .map(s -> Arrays.stream(s).map(String::trim).toArray(String[]::new))
                    .map(strArr -> getCpu(strArr))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Первоначальная коллекция процессоров. Методы map и collect\n\r" + listCPU);

        System.out.println("Методы filter и count, peek. Вывод процессоров и их количество с частотой больше 3.5");
        System.out.println(listCPU.stream()
                .filter(s -> s.getFrequency() > 3.5)
                .peek(System.out::print)
                .count());

        System.out.println("Методы skip, limit, forEach. Пропуск первых двух и вывод трех следующих процессоров");
        listCPU.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::print);

        System.out.println("Метод findFirst и sorted. Сортировка по частоте и вывод первого");
        System.out.println(listCPU.stream()
                .sorted(new CPUComparator())
                .findFirst());

        System.out.println("Метод findAny");
        System.out.println(listCPU.stream()
                .findAny());

        System.out.println("Метод allMath. Все процессоры частотой больше 2.0?");
        System.out.println(listCPU.stream()
                .allMatch(s -> s.getFrequency()>2.0));

        System.out.println("Метод anyMath. Есть ли процессоры частотой меньше 3.0?");
        System.out.println(listCPU.stream()
                .anyMatch(s -> s.getFrequency()<3.0));

        System.out.println("Метод noneMath. Все процессоры частотой меньше 4.0?");
        System.out.println(listCPU.stream()
                .noneMatch(s -> s.getFrequency()>4.0));

        System.out.println("Метод min.");
        System.out.println(listCPU.stream()
                .min(new CPUComparator()));

        System.out.println("Метод max.");
        System.out.println(listCPU.stream()
                .max(new CPUComparator()));

        System.out.println("Метод distinct и toArray");
        String[] arr = listCPU.stream()
                .distinct()
                .map(s -> s.getModel())
                .toArray(String[]::new);
        Arrays.stream(arr).forEach(System.out::println);


    }

    private static CPU getCpu(String[] strArr) {
        String model = strArr[0].toString();
        Double frequency = Double.parseDouble(strArr[1]);
        CPU cpu = new CPU(model, frequency);
        return cpu;
    }
}

class CPUComparator implements Comparator<CPU> {

    public int compare(CPU a, CPU b) {
        if(a.getFrequency()> b.getFrequency())
            return 1;
        else if(a.getFrequency()< b.getFrequency())
            return -1;
        else
            return 0;
    }
}
