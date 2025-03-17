package org.example;

import java.sql.Date;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date dob;       // Дата народження
    private String zBook;   // Залікова книжка

    public Student(int id, String surname, String name, String patronymic, Date dob, String zBook) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dob = dob;
        this.zBook = zBook;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getDob() {
        return dob;
    }

    public String getZBook() {
        return zBook;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob=" + dob +
                ", zBook='" + zBook + '\'' +
                '}';
    }
}

