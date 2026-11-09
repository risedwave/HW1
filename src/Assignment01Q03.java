public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int prev1=1;
        int prev2=1;
        int temp;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(prev1);
            if (prev1 % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" ");
            temp = prev1;
            prev1 = prev2;
            prev2 = temp + prev1;
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
