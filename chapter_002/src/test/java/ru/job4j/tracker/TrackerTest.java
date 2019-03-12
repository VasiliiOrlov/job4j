package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author VasiliiOrlov.
 * @version &Id$.
 * @since 0.1.
 */

public class TrackerTest {

    /**
     * Method whenAdd - check method add
     */
    @Test
    public void whenAdd() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Method whenReplace - check method replace
     */
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Method whenDelete - check method delete
     */
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = item.getId();
        Item delete = null;
        tracker.delete(id);
        assertThat(tracker.findById(id), is(delete));
    }

    /**
     * Method whenFindAll - check method findAll
     */
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        Item item2 = new Item("test1", "testDescription", 123L);
        tracker.add(item2);
        Item[] result = {item, item2};
        assertThat(tracker.findAll(), is(result));
    }

    /**
     * Method whenFindByName - check method findByName
     */
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        Item item2 = new Item("test2", "testDescription2", 1234L);
        tracker.add(item2);
        Item[] result = {item};
        assertThat(tracker.findByName("test1"), is(result));
    }

    /**
     * Method whenFindById - check method findById
     */
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = item.getId();
        assertThat(tracker.findById(id), is(item));
    }
}
