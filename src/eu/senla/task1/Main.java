package eu.senla.task1;

public class Main {

    public static void main(String[] args) {
        byte bytePrimitive;
        short shortPrimitive;
        int intPrimitive;
        long longPrimitive;
        float floatPrimitive;
        double doublePrimitive;
        char charPrimitive;
        boolean booleanPrimitive;

        Number number = new Number();

        number.setBytePrimitive((byte) 127);
        bytePrimitive = number.getBytePrimitive();
        Byte byteWrapper = new Byte((byte) 127);
        System.out.println("Byte Primitive = " + bytePrimitive + " + Wrapper = " + byteWrapper);

        number.setShortPrimitive((short) 32_767);
        shortPrimitive = number.getShortPrimitive();
        Short shortWrapper = new Short((short) 32_767);
        System.out.println("Short Primitive = " + shortPrimitive + " + Wrapper = " + shortWrapper);

        number.setIntPrimitive(2_147_483_647);
        intPrimitive = number.getIntPrimitive();
        Integer intWrapper = new Integer(2_147_483_647);
        System.out.println("Integer Primitive = " + intPrimitive + " + Wrapper = " + intWrapper);

        number.setLongPrimitive(9_223_372_036_854_775_807L);
        longPrimitive = number.getLongPrimitive();
        Long longWrapper = new Long(9_223_372_036_854_775_807L);
        System.out.println("Long Primitive = " + longPrimitive + " + Wrapper = " + longWrapper);

        number.setFloatPrimitive(3.333F);
        floatPrimitive = number.getFloatPrimitive();
        Float floatWrapper = new Float(3.333F);
        System.out.println("Float Primitive = " + floatPrimitive + " + Wrapper = " + floatWrapper);

        number.setDoublePrimitive(3.1415926);
        doublePrimitive = number.getDoublePrimitive();
        Double doubleWrapper = new Double(3.1415926);
        System.out.println("Double Primitive = " + doublePrimitive + " + Wrapper = " + doubleWrapper);

        number.setCharPrimitive('y');
        charPrimitive = number.getCharPrimitive();
        Character charWrapper = new Character('y');
        System.out.println("Character Primitive = " + charPrimitive + " + Wrapper = " + charWrapper);

        number.setBooleanPrimitive(true);
        booleanPrimitive = number.isBooleanPrimitive();
        Boolean booleanWrapper = new Boolean(true);
        System.out.println("Boolean Primitive = " + booleanPrimitive + " + Wrapper = " + booleanWrapper);

        String string = new String("Hello world!!!");
        System.out.println("String = " + string);

        /*
        //далее переприсваиваем переменные примитивы друг в друга
        bytePrimitive = (byte) shortPrimitive; //результат -1, т.к. превышена максимальная величина 127
        bytePrimitive = (byte) intPrimitive; //как и с short - результат -1
        bytePrimitive = (byte) floatPrimitive; //результат 3, отбросило дробную часть
        bytePrimitive = (byte) doublePrimitive; //результат 3, отбросило дробную часть
        bytePrimitive = (byte) charPrimitive; //результат 121, по юникоду 'y' - 121
        //bytePrimitive = (byte) string; //ошибка компилятора, невозможно конвертировать строку в байт
        shortPrimitive = bytePrimitive; // результат 127
        shortPrimitive = (short) intPrimitive; //результат -1, т.к. превышена максимальная величина 32767
        shortPrimitive = (short) floatPrimitive; //результат 3, отбросило дробную часть
        shortPrimitive = (short) charPrimitive; //результат 121, по юникоду 'y' - 121
        doublePrimitive = floatPrimitive; // результат 3.3329999446868896, потеряна точность
        */

        /*
        из этого следует что автоматические преобразования возможны в след.последовательности
        byte > short > int > long, int > double, int > float, long > float, long > double, short > float > double, char > int
        в некоторых преобразованиях возможна потеря точности
        */

        /*
        //далее переприсваиваем переменные оболочки друг в друга
        byteWrapper = shortWrapper.byteValue(); //результат -1, т.к. превышена максимальная величина 127
        byteWrapper = intWrapper.byteValue();  //как и с short - результат -1
        byteWrapper = floatWrapper.byteValue(); //результат 3, отбросило дробную часть
        byteWrapper = doubleWrapper.byteValue(); //результат 3, отбросило дробную часть
         */

        /*
        // преобразование строки в число
        String stringTemp = "111";
        byteWrapper = Byte.parseByte(stringTemp); //результат 111
        intWrapper = Integer.parseInt(stringTemp); //результат 111
        floatWrapper = Float.parseFloat(stringTemp); //результат 111.0
        doubleWrapper = Double.parseDouble(stringTemp); //результат 111.0
        */

        /*
        //преобразование чисел в строку
        string = Byte.toString(byteWrapper); //результат "127"
        string = Short.toString(shortWrapper); //результат "32767"
        string = Integer.toString(intWrapper); //результат "2147483647"
        string = Long.toString(longWrapper); //результат "92233720368547758077"
        string = Float.toString(floatWrapper); //результат "3.333"
        string = Double.toString(doubleWrapper); //результат "3.1415926"
        string = Boolean.toString(booleanWrapper); //результат "true"
        System.out.println(string);
        */

        /*
        //преобразование символа в строку, и строку в массив символов
        char[] arrayChar = string.toCharArray();
        string = Character.toString(charWrapper);
        */
    }
}