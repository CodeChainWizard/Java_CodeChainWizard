/**
 * fibonaci_recursion
 */
public class fibonaci_recursion {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(fiboFormula(i)+", ");
        }
    }

    static int fiboFormula(int n){
        // just for demo for long number of Fibo
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibonachi_value(int n){
        // base Condition
        if(n < 2){
            return n;
        }
        return fibonachi_value(n-1) + fibonachi_value(n-2);
    }
}