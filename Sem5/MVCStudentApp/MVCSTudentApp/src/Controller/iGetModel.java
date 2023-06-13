package Controller;

import java.util.List;

import Model.Student;
import Controller.Controller;
import Model.Model;

public interface iGetModel {
    public List<Student> getAllStudents();

    public void deleteStudent(Long id);

    public void run();
}
