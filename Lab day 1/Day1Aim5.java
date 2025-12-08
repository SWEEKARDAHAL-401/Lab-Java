import java.util.Scanner;

class Day1Aim5{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = sc.nextLine();
        System.out.println("Enter Last name");
        String last = sc.nextLine();
        System.out.println(last + " "+ first);
        sc.close();
    }
}