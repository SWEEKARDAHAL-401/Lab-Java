import java.util.Scanner;

public class Volume {
    static double pi = 3.1415;

    Volume(double r) {
        double Vol = (4*pi*r*r*r)/3;
        System.out.println("Volume of the sphere = "+ Vol);
    }

    Volume(int l) {
        int Vol = l*l*l;
        System.out.println("Volume of the cube = "+ Vol);
    }

    Volume(double r, double h) {
        double Vol = pi*r*r*h;
         System.out.println("Volume of the Cylinder = "+ Vol);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the following Volume \n 1-Sphere\n 2-Cube\n 3-Cylender");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("Enter the radious of sphere");
                double rad = sc.nextDouble();
                new Volume(rad);
                break;
            case 2: 
                System.out.println("Enter the Length");
                int len = sc.nextInt();
                new Volume(len);
                break;
            case 3: 
                System.out.println("Enter the radious of the Cylinder");
                double radious = sc.nextDouble();
                System.out.println("Enter the Height of the Cylinder");
                double Height = sc.nextDouble();
                new Volume(radious, Height);
                break;
            default:
                System.out.println("Sorry! Wrong Input");
        }
        sc.close();
    }
    
}
