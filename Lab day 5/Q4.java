// Define an interface Employee with a method getDetails() to get empolyee
// details as Empid and Ename. Also define a derived interface Manager with a method
// getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head
// which implements Manager interface and also prints all details of the employee. Write the complete
// program to display all details of one head of the department.
// Input - Enter employee id - 123
// Enter employee name - Sidharth Ambani
// Enter department id - 06
// Enter department name -Marketing
// Output - Employee id - 123
// Employee name - Sidharth Ambani
// Department id - 06
// Department name -Marketing

import java.util.*;

interface Employee {

    void getDetails();
}

interface Manager extends Employee {

    void getDeptDetails();
}

class Head implements Manager {

    int Empid;
    String Ename;
    int Deptid;
    String Deptname;
    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.println("Enter the Employee Details :");
        System.out.print("Enter the Employee ID : ");
        Empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Employee Name : ");
        Ename = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter the Department ID : ");
        Deptid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Department Name : ");
        Deptname = sc.nextLine();
    }

    void display() {
        System.out.println("Here are the Details of Employee :");
        System.out.println("Employee ID: " + Empid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee Department ID: " + Deptid);
        System.out.println("Employee Department Name: " + Deptname);
    }
}

public class Q4 {

    public static void main(String[] args) {
        Head H1 = new Head();
        H1.getDetails();
        H1.getDeptDetails();
        System.out.println("\n");
        H1.display();
    }
}