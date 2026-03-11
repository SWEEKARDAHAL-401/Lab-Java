package package1;
import demo.Factorial;
import java.util.Scanner;
public class Test extends Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        Test f = new Test();
        f.fact(n);
        sc.close();
    }
    
}
