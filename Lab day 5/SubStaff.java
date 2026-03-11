// -Define an interface with three methods – earnings(), deductions() and bonus()
// and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
// Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
// bonus() method. Write the complete program to find out earnings, deduction and bonus of a
// sbstaff with basic salary amount entered by the user as per the following guidelines –
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF 12% of basic
// bonus 50% of basic
// Input -Basic salary - 50000
// Output -Earnings - 97500
// Deduction -6000
// Bonus - 25000

import java.util.Scanner;

interface Employee {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Employee {
    double sal;

    public Manager(double sal) {
        this.sal = sal;
    }

    public void earnings() {
        System.out.println("Manager is earning " + sal);
    }

    public void deductions() {
        double total = sal - (0.12 * sal);
        System.out.println("Salary after deduction = " + total);
    }
}

public class SubStaff extends Manager {

    public SubStaff(double sal) {
        super(sal);
    }

    public void bonus() {
        double total = sal + (0.5 * sal);
        System.out.println("Total salary after Bonus = " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        double sal = sc.nextDouble();

        SubStaff s = new SubStaff(sal);
        s.earnings();
        s.deductions();
        s.bonus();
        sc.close();
    }
}
