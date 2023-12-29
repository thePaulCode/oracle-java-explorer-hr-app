package dev.thepaulcode.model;

import java.util.Arrays;

public class Department {
    //Attributes
    private String name;
    private Employee[] newEmployees = new Employee[10];
    private int lastAddedEmployeeIndex = -1;
    //Constructor
    public Department(String name){
        this.name = name;
    }

    // Method addEmployee
    public void addEmployee(Employee anEmployee){
        /*
        Increment lastAddedEmployeeIndex and add employee to this position in the employees array.
        When adding new employee to the employees array, consider array.length.
        Stop adding extra employees once you have reach your employee array capacity.
        */
        if (lastAddedEmployeeIndex < newEmployees.length){
            lastAddedEmployeeIndex++;
            newEmployees[lastAddedEmployeeIndex] = anEmployee;
        }

    }

    // Get allEmployee
    public Employee[] getAllEmployee(){
        /*
        Return an array of employees that contains the exact number of elements that matches
        the actual number of employees in this department.
        Invoker always gets an array that is already trimed to exact required size.
         */
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex+1];
        for(int i = 0; i < actualEmployees.length; i++){
            actualEmployees[i] = newEmployees[i];
        }
        return actualEmployees;
    }

    // Get anEmployee ById
    public Employee getAnEmployeeById (int id){
        /*
        Reserve a local variable, assign employee object to this variable
        and break out of the loop, when required employee has benn located.
         */

        Employee result = null;
        for(Employee emp : newEmployees)
            if(emp.getId() == id) {
               result = emp;
               break;
            }
          return result;
    }

    // Get Total Employess
    public int getTotalEmployess(){
        // This way works, but let's design it better below.
//        int total = 0;
//        for(Employee e : newEmployees){
//            total++;
//        }
//        return total;
        /*
        Variable lastAddedEmployeeIndex indicates last valid position in the employees array.
        Index starts at [0], add +1 to get the number of elements.
        */
        return lastAddedEmployeeIndex+1;
    }

    // Get Total Salary Department
    public double getTotalSalary(){
        double totalSalary = 0.0;
//        for(Employee e : newEmployees){
//            totalSalary = totalSalary + e.getSalary();
//        }
//        return totalSalary;
        //REFACTORING
        for(int i=0; i <= lastAddedEmployeeIndex; i++){
            totalSalary += newEmployees[i].getSalary();

        }
        return totalSalary;
    }

    // Get Total Average Salary Department
    public double getAverageSalary(){
//        double averageSalary = 0;
//        int count = 0;
//        for(Employee e: newEmployees){
//            count++;
//            averageSalary += e.getSalary();
//
//        }
//        try {
//
//            averageSalary = (count == 0) ? 0 : averageSalary / count;
//            averageSalary = averageSalary / count;
//        } catch (ArithmeticException exception){
//
//            System.out.println("Department is empty.");
//        }
//
//        return averageSalary;
        // REFACTORING
        if(lastAddedEmployeeIndex > -1){
            return getTotalSalary() / (lastAddedEmployeeIndex+1);
        }
        return 0.0;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
//        return "Department: Department " +
//                "" + name + '\n' +
//                Arrays.toString(newEmployees) + '\n' +
//                "Total Salary: R$" + getTotalSalary() +'\n' +
//                "Average Salary: R$" + getAverageSalary();
        return "Department " + name;
    }
}
