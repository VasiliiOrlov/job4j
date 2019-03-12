package ru.job4j.tracker;

import java.util.Objects;

/**
 * Class Item
 * @author VasiliiOrlov
 * @version $Id$
 * @since 0.1
 */
public class Item {
    private String id;
    private String name;
    private String decs;
    private long time;

    /**
     * @param name - name
     * @param decs - description
     * @param time - time
     */
    public Item(String name, String decs, long time) {
        this.name = name;
        this.decs = decs;
        this.time = time;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * method assigns id
     * @param id - id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method assigns name
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return description
     */
    public String getDecs() {
        return decs;
    }

    /**
     * method assigns description
     * @param decs - description
     */
    public void setDecs(String decs) {
        this.decs = decs;
    }

    /**
     * @return time
     */
    public long getTime() {
        return time;
    }

    /**
     * method assigns time
     * @param time - time
     */
    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(decs, item.decs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, decs, time);
    }
}
