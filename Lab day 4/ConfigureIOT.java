import java.util.Scanner;
public class ConfigureIOT {

    public ConfigureIOT() {
        System.out.println("Device is active");
    }
    public ConfigureIOT(int id, String loc) {
        System.out.println("Device id: "+id);
        System.out.println("Device Location: "+loc);
        System.out.println("Status : Currently Active");
    }
    public ConfigureIOT(int id, String loc, String net, double pow) {
        System.out.println("Device id: "+id);
        System.out.println("Device Location: "+loc);
        System.out.println("Device Network : "+net);
        System.out.println("Device Power Rating : "+pow);
        System.out.println("Status : Currently Active");
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the following \n 1-Default\n 2-device Id and location\n 3-device ID location, newwork protocol and power rating");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                new ConfigureIOT();
                break;
            case 2: 
                System.out.println("Enter Device Id");
                int id = sc.nextInt();
                System.out.println("Enter Device Location");
                String loc = sc.nextLine();
                sc.next();
                new ConfigureIOT(id, loc);
                break;
            case 3: 
                System.out.println("Enter Device Id: ");
                int id1 = sc.nextInt();
                System.out.println("Enter Device Location: ");
                String loc1 = sc.nextLine();
                sc.next();
                System.out.println("Enter Network Portocol");
                String net = sc.nextLine();
                sc.next();
                System.out.println("Enter Power Rating");
                double pow = sc.nextDouble();
                new ConfigureIOT(id1, loc1, net, pow);
                
                break;
            default:
                System.out.println("Sorry! Wrong Input");
        }
        sc.close();
    }
    
}
