package ru.job4j.array;

/**
 * Class ArrayChar
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class ArrayChar {
    /**
     * Contains all symbol word.
     */
    private char[] data;

    /**
     * Method transfers word to array.
     * @param line - word.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method compares line and prefix.
     * @param prefix - part word.
     * @return - returns the result of the comparison.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (i < data.length) { //на случай если префикс длинее слова
                if (data[i] != value[i]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
