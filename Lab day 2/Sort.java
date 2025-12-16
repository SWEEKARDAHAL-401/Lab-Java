import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number you want to put in array");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the number "+i+1);
            arr[i] = sc.nextInt();
            sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            for(int j = i;j<n;j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
