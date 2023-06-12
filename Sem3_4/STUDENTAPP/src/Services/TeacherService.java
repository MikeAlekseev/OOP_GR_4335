package Services;

import java.util.Collections;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {

  @Override
  public void createUser(Teacher teacher) {
    System.out.println("Creating teacher: " + teacher.toString());
  }

  @Override
  public List<Teacher> getUsers() {
    List<Teacher> teachers = List.of(
      new Teacher("Иван", "Иванов", 35),
      new Teacher("Петр", "Петров", 40),
      new Teacher("Сергей", "ергеев", 30)
    );
    Collections.sort(teachers, new UserComparator());
    return teachers;
  }
}