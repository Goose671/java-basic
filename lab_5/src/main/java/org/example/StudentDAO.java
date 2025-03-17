package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT id, surname, name, patronymic, dob, z_book FROM students";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String surname = rs.getString("surname");
                String name = rs.getString("name");
                String patronymic = rs.getString("patronymic");
                Date dob = rs.getDate("dob");
                String zBook = rs.getString("z_book");

                Student student = new Student(id, surname, name, patronymic, dob, zBook);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
