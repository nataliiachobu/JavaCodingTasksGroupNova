package week1;

public class OddOrEvenMethod {
    public static void main(String[] args) {
        System.out.println(OddOrEven(1));
    }

    public static String OddOrEven(int a) {
        if (a % 2 == 0) {
            return  "Even";
        } else {
            return  "Odd";
        }

    }
}
