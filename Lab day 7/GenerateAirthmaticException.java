public class GenerateAirthmaticException {
    public static void main(String args[]) {
        try {
            int a = 30/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Got an ArithmeticException");
    }
}
