package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import Model.Model;
import Model.Student;
// import View.ViewEng;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

    public void run() {
        view.display("Welcome to the Student Management System!");

        // Добавляем команду DELETE
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                view.display("Enter command: (ADD, GET, DELETE, EXIT)");
                String command = scanner.nextLine().toUpperCase();
                switch (command) {
                    case "ADD":
                        // ...
                        break;
                    case "GET":
                        // ...
                        break;
                    case "DELETE":
                        view.display("Enter student ID to delete: ");
                        Long id = scanner.nextLong();
                        scanner.nextLine();
                        try {
                            model.deleteStudent(id);
                            view.display("Student with ID " + id + " deleted successfully.");
                        } catch (IllegalArgumentException e) {
                            view.display(e.getMessage());
                        }
                        break;
                    case "EXIT":
                        // ...
                        break;
                    default:
                        view.display("Unknown command.");
                }
            }
        }
    }

}