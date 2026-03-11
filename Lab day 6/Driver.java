// -Illustrate the usage of abstract class with following Java classes –
//  An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
// method course()
//  A subclass ‘kiitian’ with course() method implementation
// Write the driver class to print the all details of a kiitian object.


import java.util.*;
abstract class Student {
   int roll;
   int reg_no;
   abstract void getinput();
   abstract void course();
}

class Kiitian extends Student {
    private String  course;
    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Roll no");
        roll = sc.nextInt();
        System.out.println("Enter registration number");
        reg_no = sc.nextInt();
        System.out.println("Enter Course");
        course = sc.nextLine();
        sc.next();
    }
    void course() {
        System.out.println("Course is  "+course);
    } 
}
public class Driver {
    public static void main(String[] args) {
        Student s1 = new Kiitian();
        s1.getinput();
        s1.course();
    }
}