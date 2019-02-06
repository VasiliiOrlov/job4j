package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author VasiliiOrlov
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    /**
     * Method checkRemove - check method remove.
     */
    @Test
    public void checkRemove() {
        ArrayDuplicate del = new ArrayDuplicate();
        String[] input = {"Hello", "World", "Super", "World", "Hello"};
        String[] expect = {"Hello", "World", "Super"};
        assertThat(del.remove(input),
                arrayContainingInAnyOrder(expect));
    }
}
