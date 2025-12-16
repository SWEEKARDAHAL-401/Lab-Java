import java.util.HashMap;
import java.util.Scanner;

class Occurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("\nOccurrences:");
        for (int key : map.keySet()) {
            System.out.println("Occurrence of " + key + " = " + map.get(key));
        }
    }
}
