package ProblemSolving.P57EmployeeSalaryName;

import java.util.List;

public class TestAndSortUsingSalary {
    public static void main(String[] args) {
        List<Empolyee> empolyeeList=List.of(new Empolyee("Vaishnavi",12000),
                new Empolyee("Sneha",12000),
                new Empolyee("Saksham",1000),
                new Empolyee("Anita",13000),
                new Empolyee("Samarth",10000));
        empolyeeList.stream().sorted((a,b)->Integer.compare(a.getSalary(),b.getSalary())).forEach(System.out::println);
    }
}
