import java.util.Scanner;

public class GenerateBill {
     GenerateBill(double price) {
        System.out.println("Price of the item is "+ price);
    }
     GenerateBill(double price, int Quantity) {
        System.out.println("Items \t Quantity \t Total");
        double total = price*Quantity;
        System.out.println( price+"      \t"+ Quantity + "             \t" + total);
    }
    GenerateBill(double price,int Quantity,double Discount) {
        System.out.println("Items \t Quantity \t Discount \t Total");
        double D = Discount/100;
        double total = price*Quantity*D;
        System.out.println( price+"       \t"+ Quantity + "    \t" + Discount + "       \t "+ total);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        int Quantity;
        System.out.println("Enter the following for the \n  1-for Item price only \n 2- for Item price and quantity \n 3- for Item price quantity and Discount percentage. ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter price of the item price");
                price = sc.nextDouble();
                new GenerateBill(price);
                break;
            case 2: 
                System.out.println("Enter item price");
                price = sc.nextDouble();
                System.out.println("Enter Quantity");
                Quantity = sc.nextInt();
                new GenerateBill(price, Quantity);
                break;
            case 3: 
                System.out.println("Enter item price");
                price = sc.nextDouble();
                System.out.println("Enter Quantity");
                Quantity = sc.nextInt();
                System.out.println("Enter Discount in percent");
                double Discount = sc.nextDouble();
                new GenerateBill(price, Quantity, Discount);
                break;
            default:
                System.out.println("Sorry! Wrong Input");
        }
        sc.close();
    }
}
