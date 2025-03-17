package model;

/**
 * Конкретный класс-наследник Human,
 * чтобы мы могли создавать ректора, деканов и т.д.
 */
public class Person extends Human {

    // Пустой конструктор для JSON
    public Person() {
    }

    public Person(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }
}
