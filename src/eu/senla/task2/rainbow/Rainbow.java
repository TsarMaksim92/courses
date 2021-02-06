package eu.senla.task2.rainbow;

import java.util.Locale;

public class Rainbow {
    //colors font
    private static final String ANSI_RESET = "\033[0m";
    private static final String ANSI_RED = "\033[0;31m";
    private static final String ANSI_ORANGE = "\033[1;33m"; //поискать оранжевый цвет
    private static final String ANSI_YELLOW = "\033[2;33m";
    private static final String ANSI_GREEN = "\033[0;32m";
    private static final String ANSI_CYAN = "\033[0;36m";
    private static final String ANSI_BLUE = "\033[0;34m";
    private static final String ANSI_PURPLE = "\033[0;35m";
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int CYAN = 5;
    private static final int BLUE = 6;
    private static final int PURPLE = 7;

    public String rainbow (int number) {
        String result = "";
        switch (number) {
            case RED:
                result = ANSI_RED + "Красный" + ANSI_RESET;
                break;
            case ORANGE:
                result = ANSI_ORANGE + "Оранжевый" + ANSI_RESET;
                break;
            case YELLOW:
                result = ANSI_YELLOW + "Желтый" + ANSI_RESET;
                break;
            case GREEN:
                result = ANSI_GREEN + "Зеленый" + ANSI_RESET;
                break;
            case CYAN:
                result = ANSI_CYAN + "Голубой" + ANSI_RESET;
                break;
            case BLUE:
                result = ANSI_BLUE + "Синий" + ANSI_RESET;
                break;
            case PURPLE:
                result = ANSI_PURPLE + "Фиолетовый" + ANSI_RESET;
                break;
        }
        return result;
    }

    public String rainbowTwoColor (int number1, int number2) {
        return changedEnding(rainbow(number1)) + "-" + rainbow(number2).toLowerCase();
    }

    private String changedEnding (String str) {
        if (str.indexOf("ый") > 0) {
            return str.replace("ый", "о");
        } else if (str.indexOf("ой") > 0) {
            return str.replace("ой", "о");
        } else if (str.indexOf("ий") > 0) {
            return str.replace("ий", "е");
        } else {
            return str;
        }
    }
}