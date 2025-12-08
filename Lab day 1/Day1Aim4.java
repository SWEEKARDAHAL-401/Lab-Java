// This is a program to print palindrome

import java.util.Scanner;

class Day1Aim4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (rev == original) {
            System.out.println(original + " is palindrome"); 
        }else {
            System.out.println(original + " is not a palindrome");
        }
        sc.close();
    }
}
