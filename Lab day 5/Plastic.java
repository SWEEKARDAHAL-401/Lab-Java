import java.util.*;

class TwoD {
    int sheetPrice = 40;
    int length, breadth;

    public TwoD(int l, int b) {
        this.length = l;
        this.breadth = b;
        int area = length * breadth;
        int price = area * sheetPrice;
        System.out.println("Price of sheet is " + price);
    }
}

class ThreeD extends TwoD {
    int boxPrice = 60;
    int height;

    public ThreeD(int l, int b, int h) {
        super(l, b);
        this.height = h;
        int volume = length * breadth * height;
        int price = volume * boxPrice;
        System.out.println("Price of box is " + price);
    }
}

class Plastic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 for 2D and 3 for 3D");
        int ch = sc.nextInt();

        switch (ch) {
            case 3:
                new ThreeD(sc.nextInt(), sc.nextInt(), sc.nextInt());
                break;
            case 2:
                new TwoD(sc.nextInt(), sc.nextInt());
                break;
            default:
                System.out.println("OOPS! Wrong Number");
        }
        sc.close();
    }
}
