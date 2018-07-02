package service;

import pojo.Student;

import java.util.List;

public interface StudentService {
    Student queryUser(int i);

    Student queryName(String name);

    boolean addUser(Student user);

    boolean updataUser(Student user);

    boolean deleteUser(int i);

    List<Student> allStudent();

    boolean updateProtrait(int i);

}
