public class Static {
    public static void main(String args[]) {
        Employee rahul = new Employee();
        rahul.empployeeId = 8;
        rahul.salary = 4000;
        // Employee.ceo = "dodda";

        Employee rajeev = new Employee();
        rajeev.empployeeId = 9;
        rajeev.salary = 1000;

        rahul.show();

        Employee.ceo = "dodda new";
        rajeev.show();
        rahul.show();

    }

}

class Employee {
    int empployeeId;
    int salary;
    static String ceo;

    static { // executed when you load a class
        ceo = "Larry";
    }

    public void show() {
        System.out.println("Employee ID : " + empployeeId + ". Salary : " + salary + ". CEO :" + ceo);
    }

}
