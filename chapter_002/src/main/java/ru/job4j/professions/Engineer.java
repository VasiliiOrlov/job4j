package ru.job4j.professions;

public class Engineer extends Profession {
    public Engineer(String name, String profession) {
        super(name, profession);
    }

    public Building builtAHouse(House house) {
        return new Building();
    }
}
