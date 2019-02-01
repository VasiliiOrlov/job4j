package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */

public class DummyBotTest {
    /**
     * Test DummyBot with question "Привет, Бот." .
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник."));
    }

    /**
     * Test DummyBot with question "Пока." .
     */
    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }

    /**
     * Test DummyBot with question "Как твои дела?" .
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Как твои дела?"), is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}


