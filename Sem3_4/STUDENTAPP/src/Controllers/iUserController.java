package Controllers;

import StudentDomen.Person;

import java.time.LocalDate;

public interface iUserController<T extends Person> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}