package ru.job4j.loop;

/**
 * Class Board - creates a board.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Board {
    /**
     * Method paint - creates a board of symbols.
     * @param wight - weight board.
     * @param height - height board.
     * @return - returns a board of symbols.
     */
    public String paint(int wight, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= wight; j++) {
                if ((j + i) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
