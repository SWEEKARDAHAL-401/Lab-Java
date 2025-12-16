import java.util.Scanner;

public class Employee {
    int EmpId;
    String Name;
    double Salary;
    void getEmpDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        EmpId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        Name = sc.nextLine();
        System.out.println("Enter Salary");
        Salary = sc.nextDouble();
    }
    void displayEmpDetails () {
        System.out.println("Employee Id "+EmpId );
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
    }
    public static void main(String[] args) {
        Employee aalok = new Employee();
        System.out.println("For Employee 1");
        aalok.getEmpDetails();
        aalok.displayEmpDetails();
        Employee farhan = new Employee();
        System.out.println("For Employee 2");
        farhan.getEmpDetails();
        farhan.displayEmpDetails();
    }

}