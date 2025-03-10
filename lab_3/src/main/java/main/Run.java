package main;

import controller.*;
import model.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    private static void createTypicalUniversity() {

        Human rector = new Human("Іван", "Петров", "Сергійович", Sex.MALE) {};


        University university = UniversityCreator.createUniversity("Національний Університет", rector);
        System.out.println(university);


        Human dean = new Human("Марія", "Іванова", "Олександрівна", Sex.FEMALE) {};
        Faculty faculty = FacultyCreator.createFaculty("Факультет комп'ютерних наук", dean);
        System.out.println(faculty);


        Human departmentHead = new Human("Петро", "Коваленко", "Дмитрович", Sex.MALE) {};
        Department department = DepartmentCreator.createDepartment("Кафедра програмування", departmentHead);
        System.out.println(department);


        Human groupHead = new Human("Олександр", "Євгенович", "Давидович", Sex.MALE) {};
        Group group = GroupCreator.createGroup("Група 1", groupHead);
        System.out.println(group);


        Student student1 = StudentCreator.createStudent("Андрій", "Сидоренко", "Володимирович", Sex.MALE);
        Student student2 = StudentCreator.createStudent("Марина", "Шевченко", "Ігорівна", Sex.FEMALE);
        System.out.println(student1);
        System.out.println(student2);
    }
}

