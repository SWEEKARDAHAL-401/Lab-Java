// Aim of the program -Write a program to perform following operations on user entered strings and
// a character –
// i) Change the case of the string done
// ii) Reverse the string done
// iii) Compare two strings done
// iv) Insert one string into another string done
// v) Convert the string to upper case and lower case done
// vi) Check whether the character is present in the string and at which position done
// vii) Check whether the string is palindrome or not. done
// viii) Check the number of word, vowel and consonant in the string done

import java.util.Scanner;
class StringOperation {
    String Insert(String S, String A) {
        S.concat(A);
        return S;
    }
    String toChangeCase(String S) {
        String A;
        if(S == S.toLowerCase()) {
            A = S.toUpperCase();
        } else {
            A = S.toLowerCase();
        }
        return A;
    }
    String reverse(String S) {
        String rev = "";
        for(int i = S.length() -1; i>=0;i--) {
            rev+=S.charAt(i);
        }
        return rev;
    }
    void Compare(String S, String A) {
        int s = 0;
        int a = 0;
        int diff;
        for (int i = S.length() - 1; i >=0; i--) {
            s += (int)S.charAt(i);
        }
        for (int i = S.length() - 1; i >=0; i--) {
            s += (int)S.charAt(i);
        }
        for (int i = A.length() - 1; i >=0; i--) {
            a += (int)A.charAt(i);
        }
        if(a>s) {
            diff = a-s;
            System.out.println("They have different ASCII value"+diff);
        } else if(s>a) {
            diff = s-a;
            System.out.println("They have different ASCII value"+diff);
        } else {
            System.out.println("They have Same ASCII value");
        }
    }
    void checkChar(String S, char A) {
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == A) {
                System.out.println("Character " + A + " Is found in "+(i+1)+" Position");
                return;
            }
        }
        System.out.println("Character " + A + " Is Not found in ");
    }
    void checkVowel(String S) {
        int v=0;
        int c = 0;
        S = S.toLowerCase();
        for(int i = S.length()-1; i>=0; i--) {
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' ||S.charAt(i) == 'u') {
                v++;
            }else {
                c++;
            }
        }
        System.out.println("No of Vowel is "+v+"\n No of Consonent is "+c);
    }
    void checkPalendrome(String S) {
        String rev = reverse(S);
        S = S.toLowerCase();
        rev = rev.toLowerCase();
        if(rev == S) {
            System.out.println("They are palendrome");
        } else {
            System.out.println("They are NOT palendrome");
        }

    }
    public static void main(String [] Args) {
        Scanner sc = new Scanner(System.in);
        String str; 
        System.out.println("Enter the String");
        str = sc.nextLine();
        StringOperation S = new StringOperation();
        String A = S.toChangeCase(str);
        System.out.println(A);
        String rev = S.reverse(str);
        System.err.println("Reverse is ");
        System.err.println(rev);
        System.err.println("Check palendrome ");
        S.checkPalendrome(str);
        System.err.println("No of vowels and consonents ");
        S.checkVowel(str);
        System.err.println("Enter Character to be searched");
        char C = sc.next().charAt(0);
        System.err.println("To check character at ith index");
        S.checkChar(str, C);
        System.err.println("For Comparism");
        String str1 = sc.nextLine();
        sc.next();
        S.Compare(str, str1);
        System.err.println("To Concat with each other");
        System.out.println(S. Insert(str, str1));
        sc.close();
    }
}