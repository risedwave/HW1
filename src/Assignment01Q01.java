public class Assignment01Q01 {
    public static void main(String[] args) {
        char ch;
        for (String arg : args) {
            ch = arg.charAt(0);
            if ((int) ch % 5 == 0){
                System.out.println(ch);
            }
        }
    }
}
