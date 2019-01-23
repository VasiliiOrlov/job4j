package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasiliiOrlov
 * @version $Id$
 * @since 23.01.2019
 */
public class ConverterTest {
    /**
     * Test RubleToEuro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test RubleToDollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test EuroToRuble.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRub(1);
        assertThat(result, is(70));
    }

    /**
     * Test DollarToRuble.
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRub(1);
        assertThat(result, is(60));
    }
}