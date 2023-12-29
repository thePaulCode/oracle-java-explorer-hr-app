package dev.thepaulcode;

import dev.thepaulcode.model.Department;
import dev.thepaulcode.model.Employee;

import java.util.Arrays;

// Oracle University
// Java Explorer Certification
// Case Study
public class HRapp {
    public static void main(String[] args) {

        System.out.printf("HR App starts \n");
        Department department1 = new Department("Research");

        Employee employee1 = new Employee(1, "Paulo Santos", 1000.55);
        Employee employee2 = new Employee(2, "Stella Santos", 2000.09);
        Employee employee3 = new Employee(3, "Olavo Santos", 3000.39);
        Employee employee4 = new Employee(4, "Luiz Santos", 4000.39);
        Employee employee5 = new Employee(5, "Moisés Santos", 5000.39);
        Employee employee6 = new Employee(6, "Maria Santos", 6000.39);
        Employee employee7 = new Employee(7, "Marta Santos", 7000.39);
        Employee employee8 = new Employee(8, "Lindinalva Santos", 8000.60);
        Employee employee9 = new Employee(9, "Josefa Santos", 9000.39);
        Employee employee10 = new Employee(10, "Adalberto Santos", 10_000.39);

        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);
        department1.addEmployee(employee4);
//        department1.addEmployee(employee5);
//        department1.addEmployee(employee6);
//        department1.addEmployee(employee7);
//        department1.addEmployee(employee8);
//        department1.addEmployee(employee9);
//        department1.addEmployee(employee10);

        System.out.println(department1);

        Employee[] emps = department1.getAllEmployee();

        for(Employee e : emps){
            System.out.println(e);
        }

        double totalSalaryDepartment = department1.getTotalSalary();
        System.out.println("Total Salary: R$" + totalSalaryDepartment);

        double averageSalaryDepartment = department1.getAverageSalary();
        System.out.println("Average Salary: R$"+ averageSalaryDepartment);


    }
}