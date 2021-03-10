package eu.senla.task8.myArray;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T>{

    private int size; //размер массива
    private int capacity = 7; //размер массива по умолчанию
    private Object[] myArray; //массив для хранения элементов
    private static Object[] emptyArray = {}; //пустой массив

    //конструктор по умолчанию
    public MyArrayList() {
        this.myArray = emptyArray;
    }

    //конструктор с заданным размером
    public MyArrayList(int capacity) {
        this.myArray = new Object[capacity];
        this.size = capacity;
    }

    public void add(int index, T obj) {
        if (index <= myArray.length && index > 0) {
            myArray = Arrays.copyOf(myArray, myArray.length + 1);
            for (int i = myArray.length-1; i>index ;i--) {
                myArray[i] = myArray [i-1];
            }
            myArray[index] = obj;
        } else if (index == myArray.length-1){
            myArray = Arrays.copyOf(myArray, index + 1);
            myArray[index] = obj;
        } else if (myArray.length == 0) {
            myArray = Arrays.copyOf(myArray, myArray.length + 1);
            myArray[0] = obj;
        } else {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }


    public boolean addAll(int index, MyList<? extends T> col) {
        Object[] tempCol = col.toArray();
        if (index <= myArray.length && index >= 0) {
            for (Object obj : tempCol) {
                this.add(index,(T) obj);
                index++;
            }
            return true;
        } else {
            return false;
        }
    }

    public T get (int index) {
        if (index < myArray.length && index >= 0) {
            return (T) myArray[index];
        } else {
            return null;
        }
    }

    public int indexOf (Object obj) {
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index].equals(obj)) {
                return index;
            }
        }
        return -1;
    }

    public int lastIndexOf (Object obj) {
        int index = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(obj)) {
                index = i;
            }
        }
        return index;
    }

    //ListIterator

    //Static

    public T remove (int index) {
        if (index < myArray.length && index >= 0) {
            Object temp = new Object();
            temp = myArray[index];
            for (int i = index; i<myArray.length-1 ;i++) {
                myArray[i] = myArray [i+1];
            }
            myArray = Arrays.copyOf(myArray, myArray.length -1);
            return (T) temp;
        } else {
            return null;
        }
    }

    public T set (int index, T obj) {
        if (index < myArray.length && index >= 0) {
            myArray[index] = obj;
            return (T) myArray[index];
        } else {
            return null;
        }
    }

    //sort

    public MyList<T> subList (int start, int end) {
        MyList temp = new MyArrayList<T>(1);
        for (int i = start, j=0; i < end; i++, j++) {
            temp.add(j, myArray[i]);
        }
        return temp;
    }

    public Object[] toArray() {
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = myArray[i];
        }
        return temp;
    }

    public String toString () {
        StringBuilder str = new StringBuilder();
        str.append("MyArrayList {");
        for (Object obj : myArray) {
            str.append(String.valueOf(obj));
            str.append(", ");
        }
        str.delete(str.length()-2, str.length());
        str.append("}");
        return str.toString();
    }
}
