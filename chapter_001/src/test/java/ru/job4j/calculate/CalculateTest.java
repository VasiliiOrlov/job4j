package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author VasiliiOrlov
 * @version $Id$
 * @since 21.01.2019
 */
public class CalculateTest
{
/**
* Test echo.
*/
@Test
public void whenTakeNameThenThreeEchoPlusName() {
    String input = "VasiliiOrlov";
    String expect = "Echo, echo, echo : VasiliiOrlov"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}