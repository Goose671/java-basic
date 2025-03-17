package main;

import controller.*;
import model.*;

public class Run {
    public static void main(String[] args) {
        // Просто пример, как создать и записать/прочитать
        University university = createTypicalUniversity();
        System.out.println(university);

        // Запишем в JSON
        String filename = "university.json";
        JsonManager.writeToFile(university, filename);

        // Прочитаем обратно
        University restored = JsonManager.readFromFile(filename);
        System.out.println("Восстановленный из JSON:");
        System.out.println(restored);

        // Сравним
        System.out.println("Равны ли объекты? " + university.equals(restored));
    }

    /**
     * Пример создания университета с 1 факультетом, 1 кафедрой, 1 группой и 2 студентами
     */
    public static University createTypicalUniversity() {
        // Вместо анонимного класса Human - используем Person
        Person rector = new Person("Іван", "Петров", "Сергійович", Sex.MALE);
        University university = UniversityCreator.createUniversity("Національний Університет", rector);

        // Факультет
        Person dean = new Person("Петро", "Іванов", "Валерійович", Sex.MALE);
        Faculty faculty = FacultyCreator.createFaculty("Факультет Інформатики", dean);

        // Кафедра
        Person depHead = new Person("Марія", "Коваленко", "Вікторівна", Sex.FEMALE);
        Department department = DepartmentCreator.createDepartment("Кафедра Програмування", depHead);

        // Группа
        Person groupHead = new Person("Олег", "Сидоренко", "Володимирович", Sex.MALE);
        Group group = GroupCreator.createGroup("ІП-01", groupHead);

        // Студенты
        Student st1 = StudentCreator.createStudent("Андрій", "Шевченко", "Миколайович", Sex.MALE);
        Student st2 = StudentCreator.createStudent("Олена", "Кравчук", "Миколаївна", Sex.FEMALE);

        // Добавляем студентов в группу
        group.addStudent(st1);
        group.addStudent(st2);

        // Добавляем группу в кафедру
        department.addGroup(group);

        // Добавляем кафедру в факультет
        faculty.addDepartment(department);

        // Добавляем факультет в университет
        university.addFaculty(faculty);

        return university;
    }
}


