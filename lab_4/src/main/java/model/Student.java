package model;

public class Student extends Human {

    // Пустой конструктор для JSON
    public Student() {
    }

    public Student(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }
}
