// : Accept 10 numbers from command line and check how many of them are
// even and how many are odd.

class CountEvenOdd {
    public static void main (String args[]) {
        int CountEven = 0;
        int CountOdd = 0;
        for(int i = 0; i < args.length; i++) {
            if(Integer.parseInt(args[i]) % 2 == 0) {
                CountEven++;
            }
            else {
                CountOdd++;
            }
        }
        System.out.print("No of Even = " + CountEven);
        System.out.print("No of Odd = " + CountOdd);
    }
}