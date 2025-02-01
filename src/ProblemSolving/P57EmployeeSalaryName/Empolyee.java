package ProblemSolving.P57EmployeeSalaryName;

public class Empolyee {
    private String name;
    private int salary;

    public Empolyee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
