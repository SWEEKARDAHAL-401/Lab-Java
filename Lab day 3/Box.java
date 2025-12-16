// Write a class file – box with three data members(length, width, height)
// and a method volume() . Also implement the application class Demo where an object of the
// box class is created with user entered dimensions and volume is printed.

import java.util.Scanner;
public class Box {
    double length;
    double width;
    double height;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }

    void volume() {
        double volume;
        volume = length*width*height;
        System.out.println("Volume of the box is: "+volume);
    }

    
        public static void main(String args[]) {
            Box b1 = new Box();
            b1.input();
            b1.volume();
        }
    }


