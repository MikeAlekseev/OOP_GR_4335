package Model;

import java.util.List;

import Controller.iGetModel;
import Controller.iGetView;

// Класс Model с хранилищем типа HashMap<Long, Student>
public class Model implements iGetModel {

    private Map<Long, Student> students = new HashMap<>();
  
    public Model(List<Student> students2) {
    }

    @Override
    public Student getStudent(Long id) {
      return students.get(id);
    }
  
    @Override
    public void addStudent(Student student) {
      students.put(student.getId(), student);
    }
  
    // Метод для удаления студента по ID
    @Override
    public void deleteStudent(Long id) {
      if (!students.containsKey(id)) {
        throw new IllegalArgumentException("Student with ID " + id + " does not exist.");
      }
      students.remove(id);
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }
  }
  
  // Интерфейс iGetModel
  public interface iGetModel {
    Student getStudent(Long id);
    void addStudent(Student student);
    void deleteStudent(Long id);
  }
  
  // Контроллер с подключенным классом Model
  public class Controller {
    
    private iGetView view;
    private iGetModel model;
  
    public Controller(iGetView view, iGetModel model) {
      this.view = view;
      this.model = model;
    }
  
    public void run() {
      view.display("Welcome to the Student Management System!");
      // ...
    }
  }