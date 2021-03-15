package eu.senla.task10.myArray;

import eu.senla.task10.NewExceedingNumberOfCharacters;
import eu.senla.task10.NewIndexOutOfBoundsException;
import eu.senla.task10.NewNegativeArraySizeException;

import java.util.ListIterator;

public interface MyList<T> {
    void add (int index, T obj) throws Exception; //добавляет в список по индексу index объект obj
    boolean addAll(int index, MyList<? extends T> col) throws Exception; //добавляет в список по индексу index все
                                                        //элементы коллекции col. Если в результате добавления список был изменен, то
                                                        //возвращается true, иначе возвращается false
    T get(int index) throws NewNegativeArraySizeException, NewIndexOutOfBoundsException; //возвращает объект из списка по индексу index
    T set(int index, T obj) throws Exception; // присваивает значение объекта obj элементу, который находится по индексу index
    void sort(MyComparator<? super T> comp); //сортирует список с помощью компаратора comp
    ListIterator<T> listIterator (); //возвращает объект ListIterator для обхода элементов списка

    T remove(int index); //удаляет объект из списка по индексу index, возвращая при этом удаленный объект
    int indexOf(Object obj); //возвращает индекс первого вхождения объекта obj в список.
                            // Если объект не найден, то возвращается -1
    int lastIndexOf(Object obj); //возвращает индекс последнего вхождения объекта obj в список.
                                 //Если объект не найден, то возвращается -1
    MyList<T> subList(int start, int end) throws Exception; //получает набор элементов, которые находятся в списке между индексами start и end
    Object[] toArray();

    /* не сделано!!!
static <T> MyList<T> of(Object... t)  //создает из набора элементов объект List
     */
}

