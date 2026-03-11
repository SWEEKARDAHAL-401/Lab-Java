public class GenerateArrayException {
    public static void main(String Args []) {
        int arr[] = new int[5];
       try {
           arr[5] = 40;
       } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
       }
       System.out.println("Got an ArrayIndexOutOfBoundsException");
    }
}