package general;
import java.util.Scanner;
public class Employee {
    protected int emp_id;
    private String ename;
    double hra;
    double da;
    public double earning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        double sal = sc.nextDouble();
        da = (sal/100)*80;
        hra = (sal/100)*15;
        double total = sal + da + hra;
        return total;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.earning();
    }
}
