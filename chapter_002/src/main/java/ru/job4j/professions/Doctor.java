package ru.job4j.professions;

public class Doctor extends Profession {
    public Doctor (String name, String profession) {
        super (name, profession);
    }

    public Diagnose heal(Patient patient) {
        return new Diagnose();
    }
}
