import java.util.Scanner;
public class Rectangle {
    double length;
    double breadth;
    double perimeter;
    void read() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Length");
        length = sc.nextDouble();
        System.out.print("Enter Breadth");
        breadth = sc.nextDouble();
    }
    void calculate() {
        perimeter = 2*(length + breadth);
    }
    void display() {
        System.out.println("Perimeter = "+perimeter);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.read();
        r1.calculate();
        r1.display();
    }
    

}
 