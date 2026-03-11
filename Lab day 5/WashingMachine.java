import java.util.Scanner;

interface Motor {
    int capacity = 0;
    void run();
    void consume();
}
public class WashingMachine implements  Motor{
    int cap;
    Scanner sc = new Scanner(System.in);
    public void run() {
        System.out.println("Machine is currnetly running");
    }
    public void consume() {
        System.out.println("It consumes power and detergent");
    }
    public void input() {
        System.out.println("Enter Power");
        cap = sc.nextInt();
    }
    public void display() {
        System.out.println("Washing machine is currently consuming "+ cap + " Watt");
    }
    public static void main(String args []) {
        WashingMachine machine = new WashingMachine();
        machine.consume();
        machine.run();
        machine.input();
        machine.display();
    }
    
}
