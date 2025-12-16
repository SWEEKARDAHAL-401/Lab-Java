import java.util.Scanner;

public class Student {
     int rollno;
    String name;
    double cgpa;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Roll No: ");
        rollno=sc.nextInt();
        System.out.println("enter the student name");
        name=sc.next();
        sc.next();
        System.out.println("enter the cgpa of student");
        cgpa=sc.nextDouble();
    
    }
    void Display()
    {
        System.out.println("student+Details");
        System.out.println("rollno"+rollno);
        System.out.println("name"+name);
        System.out.println("cgpa"+cgpa);

}
public static void main(String[] args) {
    Student S1=new Student();
    S1.input();
    S1.Display();
    Student S2=new Student();
    S2.input();
    S2.Display();
}
}
