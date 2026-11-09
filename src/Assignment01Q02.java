public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int number = Integer.parseInt(args[0]);
        double res=0;
        for (int i=1; i<=number; i++){
            res += (Math.pow(-1,i-1) * (1.0/(2*i-1)));
        }
        approxPi=4*res;
        System.out.println(approxPi + " " + actualPi);
    }
}
