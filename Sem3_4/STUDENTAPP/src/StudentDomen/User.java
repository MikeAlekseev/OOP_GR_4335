package StudentDomen;

import Services.iPersonService;


public interface User<T> {
    String getFirstName();
    String getLastName();
    int getAge();
    T getRole();
  }
  
  public interface iUserService<T extends User> {
    void createUser(T user);
    List<T> getUsers();
  }
  
  public interface iUserController<T extends User> {
    void createUser(T user);
    List<T> getUsers();
  }
  
  public class Student implements User<Student> {
  
    private String firstName;
    private String lastName;
    private int age;
  
    public Student(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
  
    @Override
    public String getFirstName() {
      return firstName;
    }
  
    @Override
    public String getLastName() {
      return lastName;
    }
  
    @Override
    public int getAge() {
      return age;
    }
  
    @Override
    public Student getRole() {
      return this;
    }
  }
  
  public class Teacher implements User<Teacher> {
  
    private String firstName;
    private String lastName;
    private int age;
  
    public Teacher(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
  
    @Override
    public String getFirstName() {
      return firstName;
    }
  
    @Override
    public String getLastName() {
      return lastName;
    }
  
    @Override
    public int getAge() {
      return age;
    }
  
    @Override
    public Teacher getRole() {
      return this;
    }
  }
  
  public class Emploee implements User<Emploee> {
  
    private String firstName;
    private String lastName;
    private int age;
  
    public Emploee(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
  
    @Override
    public String getFirstName() {
      return firstName;
    }
  
    @Override
    public String getLastName() {
      return lastName;
    }
    
    @Override
    public int getAge() {
      return age;
    }
  
    @Override
    public Emploee getRole() {
      return this;
    }
  }
  
  public class TeacherService implements iUserService<Teacher> {
  
    @Override
    public void createUser(Teacher user) {
      System.out.println("Creating teacher: " + user.toString());
    }
  
    @Override
    public List<Teacher> getUsers() {
      List<Teacher> teachers = List.of(
        new Teacher("Иван", "Иванов", 35),
        new Teacher("Петр", "Петров", 40),
        new Teacher("Сергей", "Сергеев", 30)
      );
      return teachers;
    }
  }
  
  public class TeacherController<T extends User> implements iUserController<T> {
  
    iUserService<T> userService;
  
    public TeacherController(iUserService<T> userService) {
      this.userService = userService;
    }
  
    @Override
    public void createUser(T user) {
      userService.createUser(user);
    }
  
    @Override
    public List<T> getUsers() {
      return userService.getUsers();
    } 
  }
  
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
  
  List<Emploee> employees = List.of(
    new Employee("Сергей", "Павлов", 25)
