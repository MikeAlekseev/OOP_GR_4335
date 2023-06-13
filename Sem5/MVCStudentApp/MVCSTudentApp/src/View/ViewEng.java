package View;

import java.util.List;

import Controller.iGetModel;
import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {

    @Override
    public void display(String text) {
      System.out.println(text);
    }

    @Override
    public void printAllStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudents'");
    }

    @Override
    public String prompt(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prompt'");
    }
  }
  
  // Интерфейс iGetView
  public interface iGetView {
    void display(String text);
  }
  
  // Контроллер с подключенным классом ViewEng
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
