package ru.job4j.tracker;

import java.util.*;

/**
 * Class Tracker
 * @author VasiliiOrlov.
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Array requests
     */
    private final Item[] items = new Item[100];
    /**
     * Cell pointer for new application
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * the method adds an application to the repository
     * @param item - requests
     * @return requests
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        return String.valueOf(RN.nextInt() + System.currentTimeMillis());
    }

    /**
     * method replaces the cell in the array
     * @param id - id requests
     * @param item - new item
     * @return operation status
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                break;
            }
        }
        if (findById(id).equals(item)) {
            result = true;
        }
        return result;
    }

    /**
     * method deletes a cell in an array
     * @param id - id requests
     * @return operation status
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                items[items.length - 1] = null;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * method returns a copy of the array with no null elements
     * @return array Item
     */
    public Item[] findAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * method finds applications by name
     * @param key - name requests
     * @return array
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        for (int i = 0; i != items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result[i] = items[i];
            }
        }
        return result;
    }

    /**
     * method finds orders by id
     * @param id - id requests
     * @return requests
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
