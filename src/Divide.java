public class Divide {
    public static void main(String[] args) {
        System.out.println(dividedWithoutDivisionOperator(9,8));
    }
    public static int dividedWithoutDivisionOperator(int a,int b){
        int result=0;
        while (a>=b){
            a-=b;
            result++;
        }
       return result;
    }

}
