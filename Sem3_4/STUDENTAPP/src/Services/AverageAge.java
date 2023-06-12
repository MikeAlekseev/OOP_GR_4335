package Services;

import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.User;

import java.util.ArrayList;
import java.util.Collections;


public class AverageAge<T extends User> {

  private List<T> users;

  public AverageAge(List<T> users) {
    this.users = users;
  }

  public double getAverageAge() {
    double sum = 0;
    for (T user : users) {
      sum += user.getAge();
    }
    return sum / users.size();
  }
}

// Использование класса AverageAge:
List<Student> students = List.of(
  new Student("Саят", "Валерьев", 20),
    new Student("Дмитрий", "Анатольев", 22),
    new Student("Филипп", "Кралов", 19)
);

AverageAge<Student> studentAge = new AverageAge<>(students);
System.out.println("Average student age: " + studentAge.getAverageAge());

List<Teacher> teachers = List.of(
  new Teacher("Иван", "Иванов", 35),
    new Teacher("Петр", "Петров", 40),
    new Teacher("Сергей", "Сергеев", 30)
);

AverageAge<Teacher> teacherAge = new AverageAge<>(teachers);
System.out.println("Average teacher age: " + teacherAge.getAverageAge());

List<Emploee> emploees = List.of(
  new Emploee("Павел", "Павлов", 25),
  new Emploee("Юлия", "Ласова", 28),
  new Emploee("Кирилл", "Хренов", 30)
);

AverageAge<Emploee> emploeeAge = new AverageAge<>(emploees);
System.out.println("Average emploee age: " + employeeAge.getAverageAge());
    