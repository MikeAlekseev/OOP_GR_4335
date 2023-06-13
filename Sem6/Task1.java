package Sem6;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

public Employee(String name, Date dob, int baseSalary) {
    this.name = name;
    this.dob = dob;
    this.baseSalary = baseSalary;
}

public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
}

public int getBaseSalary() {
    return baseSalary;
}

}

public class SalaryCalculator {
    private Employee employee;

public SalaryCalculator(Employee employee){
    this.employee = employee;
}

public int calculateNetSalary() {
    int tax = (int) (employee.getBaseSalary() * 0.25);//calculate in other way
    return employee.getBaseSalary() - tax;
}

}
