/**
 * GFG_Product_of_2_Numbers_using_Recursion
 */
public class GFG_Product_of_2_Numbers_using_Recursion {

    public static void main(String[] args) {
        System.out.println(productNumber(36, 4));
    }

    static int productNumber(int num1, int num2) {
        if (num1 < num2) {
            return productNumber(num2, num1);

        } else if (num2 != 0) {
            return num1 + (productNumber(num1, num2 - 1));
        } else {
            return 0;
        }
    }
}