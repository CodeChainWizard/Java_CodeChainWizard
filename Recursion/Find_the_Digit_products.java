/**
 * Find_the_Digit_products
 */
public class Find_the_Digit_products {

    public static void main(String[] args) {
        System.out.println(digitProduct(51));
    }
    
    static int digitProduct(int n) {
        if (n%10 == n) {
            return n;
        }

        return (n % 10) * digitProduct(n / 10);
    }
}