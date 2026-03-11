package marketing;
import general.Employee;
import java.util.*;
public class Sales extends Employee {
    public void tallowance(double sal) {
       double total = earning(sal);
       double allow = 0.05 * earning(sal);
       System.out.println("Travel allowence = "+allow);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        double sal = sc.nextDouble();
        Sales e1 = new Sales();
        e1.tallowance(sal);
        sc.close();
    }
}


