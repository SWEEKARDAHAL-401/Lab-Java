import java.util.Scanner;
public class Cgpa {
    static int Count = 0;
    int roll;
    String name;
    double CGPA;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no");
        roll = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter CGPA");
        CGPA = sc.nextDouble();
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("CGPA: "+CGPA);
    }
    public static void main(String[] args) {
        double lowest = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Student you want to create");
        int n =  sc.nextInt();
        Cgpa C[] = new Cgpa[n];
        for(int i = 0; i < C.length; i++) {
            C[i] = new Cgpa();
        }
        System.out.println("Enter Student details");
        for(int i = 0; i < C.length; i++) {
            System.out.println("For student number"+(i+1));
            C[i].input();
        }
        for(int i = 0; i < C.length; i++) {
        if(lowest < C[i].CGPA){
            lowest = C[i].CGPA;
            Count = i;
        }
            }   
        System.out.println("Details of lowest Cgpa Student is");
        C[Count].display();
        System.out.println("Total number of Student are:");
        for(int i = 0; i < C.length; i++) {
            System.out.println("For student number"+(i+1));
            C[i].display();
        }
    }

}
