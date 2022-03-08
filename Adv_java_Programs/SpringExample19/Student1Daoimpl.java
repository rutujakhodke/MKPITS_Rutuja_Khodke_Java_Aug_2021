package com.example.springdatasrc.dao;

import com.example.springdatasrc.Student1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//loose coupling
public class Student1Daoimpl implements Student1Dao{
 JdbcTemplate template;
//    @Override
//    public void insert(Student1 obj) {
//        String query="INSERT INTO Student (id,NAME,course) VALUES (?,?,?)";
//        int res = this.template.update(query,obj.getId(),obj.getName(),obj.getCourse());
//        System.out.println(res+ " record inserted");
//    }

//    @Override
//    public void displaybyId(int id) {
//        String query = "SELECT name FROM student WHERE id=?";
//
//        String s = this. template.queryForObject(query,new Object[]{id},String.class);
//        System.out.println(s);
//    }
//by using Row mapper
//    @Override
//    public void displaybyId(int id) {
//        String query = "SELECT * FROM student WHERE id=?";
//
//        Student1 sobj1 = (Student1) this.template.queryForObject(query, new Object[]{id}, new Rowdemo());
//        System.out.println(sobj1.toString());
//    }

    @Override
    public void   displayallrec() {
        String query = "SELECT * FROM student";
        List<Student1> student1List=template.query(query,new Rowdemo());
        System.out.println(student1List.size());

    }

    @Override
    public void updaterecbyId(int id) {
        String query="UPDATE student SET course=? WHERE id=?;";
        int res = this.template.update(query, "Data Science",12);
        System.out.println(res + " record updated");
    }

    @Override
    public void deleterecbyId(int id) {
        String query="DELETE FROM student WHERE id=?;";
        int res = template.update(query,  14);
            System.out.println(res + " record deleted");
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    class Rowdemo implements RowMapper<Student1> {
        @Override
        public Student1 mapRow(ResultSet resultSet, int i) throws SQLException {
            Student1 obj=new Student1();
          obj.setId(resultSet.getInt("id"));
          obj.setName(resultSet.getString("name"));
          obj.setCourse(resultSet.getString("course"));
            return obj;

        }
    }

}
