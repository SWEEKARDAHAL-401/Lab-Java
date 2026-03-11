package demo;
public class Factorial {
    public void fact(int a) {
        int val = 1;
        for(int i = a; i>0;i--) {
            val = val*i;
        }
        System.out.println("FACTORIAL = "+val);
    }
    public static void main(String[] args) {
        int a = 5;
        Factorial f = new Factorial();
        f.fact(a);
    }
}
