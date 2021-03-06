package eu.senla.task4;

import java.util.Arrays;

public class Helper {

    //метод генерирует матрицу размером ixj, заполняет строковыми элементами размером 6 символов (1 шт дабл, 2 шт стринг)
    public String[][] matrix (int i, int j) {
        String[][] matrix = new String[i][j];
        for (String[] line : matrix) {
            for (int index = 0; index < line.length; index++) {
                if (index % 3 == 0) {
                    line[index] = getRandomDouble();
                } else {
                    line[index] = getRandomStr();
                }
            }
        }
        return matrix;
    }

    //метод генерирует случайную строку размером 6 символов
    private String getRandomStr () {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; //52 character (index 0-51)
        String str = "";
        for (int index = 0; index < 6; index++) {
            str = str + alphabet.charAt((int)(Math.random()*52));
        }
        return str;
    }

    //метод генерирует дабл размером 6 символов "1,2345"
    private String getRandomDouble () {
        String number = "0123456789"; //10 character
        String str = number.charAt((int)(Math.random()*10)) + ".";
        for (int index = 0; index < 4; index++) {
            str = str + number.charAt((int)(Math.random()*10));
        }
        return str;
    }

    //метод возвращает главную диагональ
    public String[] getMainDiagonal (String[][] matrix) {
        String[] mainDiagonal = new String[matrix.length];
        int j = 0;
        for (int i = 0; i < mainDiagonal.length; i++) {
            mainDiagonal[i] = matrix[i][j];
            j++;
        }
        return mainDiagonal;
    }

    //метод возвращает побочную диагональ
    public String[] getSideDiagonal (String[][] matrix) {
        String[] sideDiagonal = new String[matrix.length];
        int j = 0;
        for (int i = sideDiagonal.length-1; i >= 0; i--) {
            sideDiagonal[j] = matrix[i][j];
            j++;
        }
        return sideDiagonal;
    }

    //метод сравнивает главную и побочную диагональ
    public boolean compareDiagonal (String[] mainDiagonal, String[] sideDiagonal) {
        return Arrays.equals(mainDiagonal, sideDiagonal);
    }

    //метод объединяет массивы диагоналей
    public String[] getGeneralArray (String[] mainDiagonal, String[] sideDiagonal) {
        String[] generalArray = new String[mainDiagonal.length + sideDiagonal.length];
        System.arraycopy(mainDiagonal,0, generalArray,0,mainDiagonal.length);
        System.arraycopy(sideDiagonal,0, generalArray,mainDiagonal.length,sideDiagonal.length);
        return  generalArray;
    }
    //метод выводит строку в консоль согласно п.3 задания
    public StringBuilder getString (String[] generalArray){
        StringBuilder stringBuilder = new StringBuilder();
        int sizeArrayString = 0;
        for (String str : generalArray) {
            if (Character.isLetter(str.charAt(0))) {
                ++sizeArrayString;
            }
        }
        String[] arrayString = new String[sizeArrayString];
        int index = 0;
        for (String str : generalArray) {
            if (Character.isLetter(str.charAt(0))) {
                arrayString[index] = str.substring(1,4);
                ++index;
            }
        }
        for (String str : arrayString) {
            stringBuilder.append(str + ", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-2);
        return stringBuilder;
    }

    //метод выводит строку в консоль согласно п.4 задания
    public StringBuilder getStringNumber (String[] generalArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int sizeArrayDouble = 0;
        for (String str : generalArray) {
            if (Character.isDigit(str.charAt(0))) {
                ++sizeArrayDouble;
            }
        }
        double numberTemp;
        Double[] arrayDouble = new Double[sizeArrayDouble];
        int index = 0;
        for (String number : generalArray){
            if (Character.isDigit(number.charAt(0))) {
                numberTemp = Double.parseDouble(number);
                if (Character.getNumericValue(number.charAt(2)) >= 7) {
                    numberTemp = Math.round(numberTemp);
                } else {
                    numberTemp = Math.floor(numberTemp);
                }
                arrayDouble[index] = numberTemp;
                ++index;
            }
        }
        for (double number : arrayDouble) {
            stringBuilder.append(number + "_");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder;
    }

    //метод выводит в консоль исходную матрицу
    public void printMatrix (String[][] matrix) {
        for (String[] line : matrix) {
            for (String strTemp : line) {
                System.out.print(strTemp +" ");
            }
            System.out.println();
        }
    }
}
