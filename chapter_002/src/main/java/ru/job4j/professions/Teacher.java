package ru.job4j.professions;

public class Teacher extends Profession {
    public Teacher(String name, String profession) {
        super(name, profession);
    }

    public Diplom teachAStudent(Student student) {
        return new Diplom();
    }
}
