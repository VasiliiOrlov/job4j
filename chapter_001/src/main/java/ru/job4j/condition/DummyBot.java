package ru.job4j.condition;

/**
 * DummyBot - stupid bot.
 * @author VasiliiOrlov
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Method answers questions.
     * @param question - question client.
     * @return - return answer.
     */
    public String answer(String question) {
        String rs1 = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rs1 = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rs1 = "До скорой встречию.";
        }
        return rs1;
    }
}
