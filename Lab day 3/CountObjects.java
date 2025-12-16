// Program to find no. of objects created out of a class using ‘static’
// modifier.
import java.util.Scanner;
public class CountObjects {
    static int Count = 0;
    void count() {
        Count++;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Object you want to create");
        int n = sc.nextInt();
        sc.close();
        CountObjects C[] = new CountObjects[n];
        for(int i = 0; i< C.length; i++) {
            C[i] = new CountObjects();
            C[i].count();
        }
        System.out.println("Number of Object Created: "+Count);
    }
}
