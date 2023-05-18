public class OddOrEvenMethod {
    public static void main(String[] args) {
        System.out.println(OddOrEven(197));
    }
    public static String OddOrEven(int a){
        String result="";
        if(a%2==0){
            result="Even";
        }else{
            result="Odd";
        }
        return result;
    }
}
