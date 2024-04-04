/**
 * Newton_SQRT_Method
 */
public class Newton_SQRT_Method {

    public static void main(String[] args) {
        System.out.println(methodNewthon(40));
    }

    static double methodNewthon(int n){
        double x = n;
        double root;


        while (true) {
            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}