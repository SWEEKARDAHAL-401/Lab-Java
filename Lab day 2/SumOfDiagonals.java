import java.util.Scanner;

class SumOfDiagonals {
    int arr[][] = new int [3][3];
    void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 elements for theris Equivalent location");
        for(int i=1; i<=3; i++) {
            for(int j=1;j<=3;j++) {
                System.out.println("Enter element for location"+ i + "," + j);
                arr[i-1][j-1] = sc.nextInt();
            }
        }
    }
    void PrintData() {
        System.out.println("The given matrix is");
        for(int i=1; i<=3; i++) {
            for(int j=1;j<=3;j++) {
                System.out.print(arr[i-1][j-1] + "  ");
            }
            System.out.print("\n");
        }
        int left = arr[0][0]+arr[1][1]+arr[2][2];
        int right = arr[0][2]+arr[1][1]+arr[2][0];
        System.out.println("Left: "+left);
        System.out.println("Right: "+right);
    }
    public static void main(String[] args) {
        SumOfDiagonals matrix = new SumOfDiagonals();
        matrix.InputData();
        matrix.PrintData();
    }
}