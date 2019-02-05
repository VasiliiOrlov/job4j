package ru.job4j.array;

/**
 * Class BubbleSoft.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class BubbleSoft {
    /**
     * method  soft - sorts numbers in an array.
     * @param array - array.
     * @return - array with sorted numbers.
     */
    public int[] soft(int[] array) {
        for (int z = 1; z < array.length; z++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int y = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = y;
                }
            }
        }
        return array;
    }
}