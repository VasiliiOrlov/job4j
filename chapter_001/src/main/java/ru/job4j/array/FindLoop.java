package ru.job4j.array;

/**
 * Class FindLoop - find value in array.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class FindLoop {
    /**
     * Method indexOf - returns the index of the value in the array.
     * @param data - array.
     * @param el - value.
     * @return - index of the value.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < 3; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
