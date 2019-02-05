package ru.job4j.array;

/**
 * Class Turn - to mirror array.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Turn {
    /**
     * Method back - return mirror array.
     * @param array - array.
     * @return -mirror array.
     */
    public int[] back(int[] array) {
        for (int index = 0; index <= array.length / 2 - 1; index++) {
            int x = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = x;
        }
        return array;
    }
}